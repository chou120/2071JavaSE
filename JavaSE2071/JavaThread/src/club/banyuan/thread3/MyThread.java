package club.banyuan.thread3;

import java.util.Date;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 3:35 下午
 */
public class MyThread  extends   Thread{
  public MyThread(String name) {
    super(name);
  }
  @Override
  public void run() {
    for (int i = 0; i <10; i++) {
      System.out.println(Thread.currentThread().getName()+"---"+i);
      try {  //当前执行线程休眠
        Thread.sleep((int)(Math.random()*1000));  //  10  6  4   6  4
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName()+"当前线程再休眠,"+new Date());
    }
  }
}
class  Test{
  public static void main(String[] args) {
    MyThread thread1 = new MyThread("线程A");
    MyThread thread2 = new MyThread("线程B");
    MyThread thread3 = new MyThread("线程C");
    MyThread thread4 = new MyThread("线程D");
    thread1.start();
    //public final void join():等待线程终止
    try {
      thread1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread2.start();
    try {
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread3.start();
    try {
      thread3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread4.start();
    try {
      thread4.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
