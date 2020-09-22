package club.banyuan.thread10;

import java.util.Random;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/22 3:12 下午
 */
public class SetConsumer implements Runnable {   //月饼生产商

  //生成两种月饼
  private static volatile int i = 0;
  private Moon moon;

  public SetConsumer(Moon moon) {
    this.moon = moon;
  }
  @Override
  public void run() {

    while (true) {
      synchronized (moon) {  //false

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        if (moon.flag) {  //生产者如果有蛋糕就等待
          try {
            System.out.println(Thread.currentThread().getName()+"已生产月饼,等待消费者消费..进入等待状态...");
            moon.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

        if (i % 2 == 0) {
          moon.name = "蛋黄月饼";
          moon.price = 50.0;
        } else {
          moon.name = "水果月饼";
          moon.price = 80.0;
        }
        moon.flag = true;// true
        //把当前对象所在的等待的线程进行唤醒
        moon.notify();//唤醒消费者线程
      }
      i++;

    }
  }
}
