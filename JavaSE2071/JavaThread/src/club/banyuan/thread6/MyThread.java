package club.banyuan.thread6;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 4:23 下午
 */
public class MyThread  extends  Thread{

  /**
   *
   *  * NEW(初始):尚未启动的线程的线程状态。
   *  * RUNNABLE(运行):可运行线程的线程状态。
   *  * BLOCKED(阻塞):线程的线程状态被阻止，正在等待监视器锁。
   *  * WAITING(等待):等待线程的线程状态。
   *  * TIMED_WAITING(超时等待):具有指定等待时间的等待线程的线程状态。
   *  * TERMINATED(终止):终止线程的线程状态。
   *
   */


  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+"状态是:"+Thread.currentThread().getState());
    //for (int i = 0; i <10; i++) {
      System.out.println(getName()+"---");
//      try {
//        //sleep(1000);
//        //wait(1000);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//   // }

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      //e.printStackTrace();
      System.err.println("线程被中断");
    }
    System.out.println("-----");
  }
}
class  TestMyThead{
  public static void main(String[] args) {
    MyThread threadA = new MyThread("线程A");
    MyThread threadB = new MyThread("线程B");

    /**
     * 线程A状态是:NEW
     * 线程B状态是:NEW
     */
    System.out.println(threadA.getName()+">>>>>状态是:"+threadA.getState());
    System.out.println(threadB.getName()+">>>>>状态是:"+threadB.getState());

    threadA.start();
    threadB.start();
    try {
      Thread.sleep(3000);
      threadB.interrupt(); //调用中断线程的方法
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

//    try {
//      threadA.join();
//      threadB.join();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
   // TERMINATED(终止):终止线程的线程状态。
    System.out.println(Thread.currentThread().getName()+"---"+threadA.getName()+"-----状态是:"+threadA.getState()); //TERMINATED(终止):终止线程的线程状态。
    System.out.println(Thread.currentThread().getName()+"---"+threadB.getName()+"-----状态是:"+threadB.getState()); //TERMINATED(终止):终止线程的线程状态。

  }
}