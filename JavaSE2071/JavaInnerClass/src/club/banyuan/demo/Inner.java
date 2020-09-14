package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/14 3:30 下午
 */
public class Inner {

  /**
   *
   * - -静态内部类
   *
   * - -成员内部类
   *
   * - -方法内部类
   *
   * - -匿名内部类
   *
   */



  //成员内部类
  class Demo{
      public  Demo(){

      }
  }
  //Inner.class   Inner$Demo.class
}
class TestInner{

  public static void main(String[] args) {
      new  Inner().new Demo();
  }
}
