package club.banyuan.thread8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/22 2:21 下午
 */

class  Tool{
  public static final Lock lock = new ReentrantLock();
}

public class ThreadDemo1  extends  Thread{
  public ThreadDemo1(String name) {
    super(name);
  }
  @Override
  public void run() {
    try {
      if(Tool.lock.tryLock(3000, TimeUnit.MILLISECONDS)) {  //线程尝试获取锁
        try {
          System.out.println(getName() + "进来了...获取了当前锁...");
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        } finally {
          System.out.println(getName()+"释放了锁");
          Tool.lock.unlock();//主动释放锁
        }
      }else{
        System.out.println(getName()+"没有获取到锁...被其他线程占用了...."+Tool.lock.tryLock());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class TestThreadDemo1{

  public static void main(String[] args) {
    ThreadDemo1 threadDemo1 = new ThreadDemo1("线程A");
    ThreadDemo1 threadDemo2 = new ThreadDemo1("线程B");
    threadDemo1.start();
    threadDemo2.start();

  }
}

