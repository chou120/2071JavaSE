package club.banyuan.thread10;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/22 3:12 下午
 */
public class GetConsumer implements Runnable {

  private Moon moon;

  public GetConsumer(Moon moon) {
    this.moon = moon;
  }
  @Override
  public void run() {
    while (true) {
      //如果生产者没有生产月饼  消费者就一直处于等待状态  直到生产者有月饼了...
      synchronized (moon) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        if (!moon.flag) {
          try {
            System.out.println(Thread.currentThread().getName() + "说:月饼还没生产,等待生产者生产,进入等待状态..");
            moon.wait();  //消费者线程进入等待状态....
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println(
            Thread.currentThread().getName() + "月饼名叫:" + moon.name + ",月饼价格:" + moon.price);
        moon.notify();//唤醒生产的线程
        moon.flag = false;
      }
    }
  }
}

class Test {

  public static void main(String[] args) {
    Moon moon = new Moon();

    SetConsumer setConsumer = new SetConsumer(moon);
    GetConsumer getConsumer = new GetConsumer(moon);

    Thread t1 = new Thread(setConsumer, "张三");
    Thread t2 = new Thread(getConsumer, "李四");
    t1.start();
    t2.start();

  }
}