package club.banyuan.thread12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/23 1:47 下午
 */
public class Demo {

  //HashMap和ConcurrentHashMap测试线程安全性:

 final  static Map<String,String> map=new HashMap<>();
  //final  static ConcurrentHashMap<String,String> map=new ConcurrentHashMap<>();

  public static void main(String[] args) {
    Thread   t=new   Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 50; i++) {
          map.put(String.valueOf(i), String.valueOf(i));
        }
      }};

    Thread  t1=new   Thread(){
      @Override
      public void run() {
        for (int j = 50; j <100; j++) {
          map.put(String.valueOf(j),String.valueOf(j));
        }
      }
    };

    t.start();
    t1.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    for(int l =0;l <100;l++){
      //如果key和value不同，说明两个线程在put的过程出现异常
      if(!String.valueOf(l).equals(map.get(String.valueOf(l)))){
        System.out.println(String.valueOf(l)+": "+map.get(String.valueOf(l)));
      }
    }


  }
}
