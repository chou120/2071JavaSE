package club.banyuan.thread4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 4:10 下午
 */
public class MyThread extends  Thread {

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for(int x = 0; x < 10; x++){
      System.out.println(getName() + ":" + x);
     // Thread.yield(); //在某个时间片段 有这种效果
    }
  }
}

class  Test{
  public static void main(String[] args) {
    MyThread thread1 = new MyThread("线程A");
    MyThread thread2 = new MyThread("线程B");
    MyThread thread3 = new MyThread("线程C");
   // MyThread thread4 = new MyThread("线程D");

      thread1.setPriority(10);
      thread2.setPriority(5);
      thread3.setPriority(1);

    thread1.start();
    thread2.start();
    thread3.start();
   // thread4.start();


  }
}
