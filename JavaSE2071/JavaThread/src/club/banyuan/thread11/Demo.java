package club.banyuan.thread11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/23 1:42 下午
 */
public class Demo {

  public static void main(String[] args) {
    CyclicBarrier cb = new CyclicBarrier(3);
    for (int i = 0; i < 6; i++) {
      new Thread(() -> {
        try {
          Thread.sleep(1000);
          cb.await();  //等待的时候
          System.out.println("每2个线程执行完就会打印这句话");
        } catch (InterruptedException | BrokenBarrierException e) {
          e.printStackTrace();
        }
      }).start();
    }

  }

}
