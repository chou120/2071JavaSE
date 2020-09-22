package club.banyuan.thread9;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/22 3:00 下午
 */
public class MyThread extends Thread {
  @Override
  public void run() {
    synchronized (Tool.obj1) {
      System.out.println(getName() + "进来了,得到了A");
      synchronized (Tool.obj2) {
        System.out.println(getName() + "进来了,得到了B");
      }
    }
  }
}
class MyThread2 extends Thread {
  @Override
  public void run() {
    synchronized (Tool.obj2) {
      System.out.println(getName() + "进来了,得到了B");
      synchronized (Tool.obj1) {
        System.out.println(getName() + "进来了,得到了A");
      }
    }
  }
}

class TestDeadLock {

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.setName("线程A");
    MyThread2 myThread2 = new MyThread2();
    myThread2.setName("线程B");
    myThread.start();
    myThread2.start();

  }
}