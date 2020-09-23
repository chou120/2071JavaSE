package club.banyuan.thread13Pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/23 2:14 下午
 */
public class Demo  extends  Thread{
  public Demo(String name) {
    super(name);
  }
  @Override
  public void run() {
    System.out.println(Thread.currentThread()==this);
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    Demo demo = new Demo("线程1");
    demo.start();

     // 线程池里面 到底是不是回收利用了
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit(demo);

//
//     ExecutorService executorService1 = Executors.newFixedThreadPool(10);
//     for (int i = 0; i < 20; i++) {
//       int index = i; // effectively final
//       executorService1.submit(new Runnable() {
//         @Override
//         public void run() {
//           System.out.println(Thread.currentThread().getName()+"线程启动" + index);
//           try {
//             Thread.sleep(1000);
//           } catch (InterruptedException e) {
//             e.printStackTrace();
//           }
//         }
//       });

      // executorService1.shutdown(); //关闭线程池

    ExecutorService executorService2 = Executors.newFixedThreadPool(3);
    Callable<String>  callable=()->{
      System.out.println(Thread.currentThread().getName()+"在执行...");
      return "张三";
    };

    Future<String> submit = executorService2.submit(callable); //调用submit(call) 返回数据
    try {
      System.out.println(">>>>>"+submit.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

  }
}

//使用线程池(10)去执行 发送一万条数据给用户  分别显示每条线程的名称及其发送记录



