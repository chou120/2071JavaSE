package club.banyuan.thread13Pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/23 2:41 下午
 */
public class TestThreadPool {
  public  static  List<String>  init(){
    List<String>  list=new ArrayList<>();
    for (int i = 0; i <10000; i++) {
      list.add("半圆:"+i);
    }
    return list;
  }
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(6);
    List<String> init = init();
    Tool  tool =new Tool();
    int   thread_Number=init.size()/10;
    List<List<String>> lists=new ArrayList<>();

    for (int i = 0; i <10; i++) {
      List<String>  list=new ArrayList<>();
      for (int j = 0; j < init.size(); j++) {
        int   index=(j+1)/thread_Number;  //  1~999  都在1000里面
        if(index==i){
          list.add(init.get(j));
        }
      }
      lists.add(list);
    }

    for (int i = 0; i <10; i++) {
      Future submit = executorService.submit(new MyCallable(lists,tool));//启动线程池的线程...
      try {
        System.out.println("是否执行完毕:"+submit.get());
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
    }
  }
}
class  Tool  {
  int anInt=0;
}

class  MyCallable  implements Callable{

  private List<List<String>>  list;  //一个线程所执行的消息
  private final Tool  tool;

  public MyCallable(List<List<String>> list, Tool tool) {
    this.list = list;
    this.tool = tool;
  }

  @Override
  public Object call() throws Exception {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    synchronized (tool) {
      System.out.println(Thread.currentThread().getName() + "发送的消息为:" + list.get(tool.anInt));
      tool.anInt++;
    }
    return true;
  }
}