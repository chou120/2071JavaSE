package club.banyuan.thread2;

import java.lang.Thread.State;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 3:21 下午
 */
public class MyThread implements  Runnable{
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println(Thread.currentThread().getName()+"---"+i);
    }
  }
}
class TestMyThread{

  public static void main(String[] args) {  //主线程
//    MyThread  myThread=new MyThread();
//   // myThread.start();
//    Thread thread = new Thread(myThread,"线程A");
//    thread.start();
//    Thread thread2 = new Thread(myThread,"线程B");
//    thread2.start();

//     Thread  thread= new Thread(new  Runnable(){
//        @Override
//        public void run() {
//          for (int i = 0; i < 20; i++) {
//            System.out.println(Thread.currentThread().getName()+"---"+i);
//          }
//        }
//      });
//    thread.start();
//

//    Runnable runnable = () -> {
//      for (int i = 0; i < 20; i++) {
//        System.out.println(Thread.currentThread().getName() + "---" + i);
//      }
//    };

//    new  Thread(() -> {
//      for (int i = 0; i < 20; i++) {
//        System.out.println(Thread.currentThread().getName() + "---" + i);
//      }
//    }).start();
//    System.out.println(Thread.currentThread().getName()+"---");

    long id = Thread.currentThread().getId();
    String name = Thread.currentThread().getName();
    int priority = Thread.currentThread().getPriority(); //优先级  一般默认5
    State state = Thread.currentThread().getState();  //获取线程状态
    String threadGroupName = Thread.currentThread().getThreadGroup().getName();
    System.out.println("id="+id+"; name="+name+"; priority="+priority+"; state="+state+"; threadGroupName="+threadGroupName);




  }
}
