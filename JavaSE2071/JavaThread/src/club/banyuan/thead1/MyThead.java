package club.banyuan.thead1;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/21 3:10 下午
 */
public class MyThead  extends   Thread{

  public MyThead(String name) {
    super(name);
  }

  @Override
  public void run() {  //具体哪个线程进来了..
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName()+"线程执行了...."+i);
    }
  }
}
class   Test{
  public static void main(String[] args) {
    MyThead myThead = new MyThead("线程A");
   // myThead.setName("线程A");
   // myThead.run();
    myThead.start();
    MyThead myThead2 = new MyThead("线程B");
    MyThead myThead3 = new MyThead("线程C");
   // myThead2.run();
  //  myThead2.setName("线程B");
    myThead2.start();
   // myThead2.start(); java.lang.IllegalThreadStateException 不能二次启动
    myThead3.start();



  }
}
