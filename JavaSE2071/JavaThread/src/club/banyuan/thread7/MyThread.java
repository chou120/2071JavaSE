package club.banyuan.thread7;

import club.banyuan.Util;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/22 9:08 上午
 */
public class MyThread extends Thread {
/*

  private static int number = 100; //
  // Student  student=new Student();
  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    //看电影 买票
    while (true) {
//当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
      //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
      synchronized (Util.student) {  // this表示当前对象  四个线程对象不能保证锁的唯一性
        //这里使用的是类文件   认为是类对象
        if (number > 0) {
          System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
        } else {
          break;
        }
//        try {
//          Thread.sleep((int) (Math.random() * 1000));
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
      }
    }
  }
}

class Test {

  public static void main(String[] args) {

    MyThread myThread1 = new MyThread("窗口A");
    MyThread myThread2 = new MyThread("窗口B");
    MyThread myThread3 = new MyThread("窗口C");
    MyThread myThread4 = new MyThread("窗口D");

//    System.out.println(myThread1.student.hashCode());
//    System.out.println(myThread2.student.hashCode());
//    System.out.println(myThread3.student.hashCode());
//    System.out.println(myThread4.student.hashCode());


    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();
  }
}
*/
}

class MyThread2 implements Runnable {

  private static int number = 50;

  @Override
  public void run() {
    //看电影 买票
    while (true) { //
      show();
    }
  }

//  synchronized   void  show(){  //同步方法  锁是当前的实例对象
////当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
//      //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
//    //  synchronized (Student.class) {  // this表示当前对象  四个线程对象不能保证锁的唯一性
//       // if (number > 0) {
//    System.out.println(Thread.currentThread().getName()+"进来了...");
//       // }
//      if (number > 0) {
//        System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
//      }
//      // synchronized (this){
//         try {
//           Thread.sleep((int) (Math.random() * 1000));  //锁有没释放   类文件
//         } catch (InterruptedException e) {
//           e.printStackTrace();
//         }
//
//       //
//   // }
//  }

  synchronized   static    void  show(){  //同步方法  锁是当前的实例对象
//当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
    //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
    //synchronized (Student.class) {  // this表示当前对象  四个线程对象不能保证锁的唯一性
     // System.out.println(Thread.currentThread().getName() + "进来了...");
      if (number > 0) {
        System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
      }
  //  }
    try {
      Thread.sleep((int) (Math.random() * 1000));  //锁有没释放   类文件
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class TestMyRunnable {

  public static void main(String[] args) {

    MyThread2 myThread = new MyThread2();

    Thread myThread1 = new Thread(myThread, "窗口A");
    Thread myThread2 = new Thread(myThread, "窗口B");
    Thread myThread3 = new Thread(myThread, "窗口C");
    Thread myThread4 = new Thread(myThread, "窗口D");

    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();

  }
}
