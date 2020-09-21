package club.banyuan.thread5;

import java.util.Date;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 4:19 下午
 */
public class ThreadStop extends  Thread{

  @Override
  public void run() {
    System.out.println("开始时间：" + new Date());
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      //e.printStackTrace();
      System.err.println("线程被中断");
    }
    System.out.println("结束时间：" + new Date());
  }
}

 class ThreadStopDemo {
  public static void main(String[] args) {
    ThreadStop ts = new ThreadStop();
    ts.start();
    try {
      Thread.sleep(3000);
      ts.interrupt(); //调用中断线程的方法
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
