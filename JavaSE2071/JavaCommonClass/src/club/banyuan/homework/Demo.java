package club.banyuan.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/8 9:24 上午
 */
public class Demo {

  /**
   * 静态的生命周期
   * @param args
   *
   * bootstrap 类的加载器  --->Demo.class    内存里面 (方法区)  静态域  （static  变量  静态方法）  和 非静态域
   *
   * 1.首先加载静态的所有成员   （在创建对象之前和加载class文件之后立马就加载到内存中）
   * 2.静态的变量或者方法被调用之后 不会自动结束  还会在静态域里面
   * 3.成员变量或者方法 在创建对象的时候被调用 请问如果创建的 两个对象不一样
   * 4.静态的成员随着程序的结束而消失  而对象的成员随着对象的消失而消失
   *
   */

  public static void main(String[] args) {
   new  Demo().method();
    Demo demo1 = new Demo();
    demo1.method();
  }

  public   void method(){
//    int  i=0;
//    System.out.println(i);
//   //static int   i=0;
  //  System.out.println(i);

  }

  public  static  void showInfo(){

  }





}
