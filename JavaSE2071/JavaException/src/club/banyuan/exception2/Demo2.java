package club.banyuan.exception2;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 3:15 下午
 */
public interface Demo2 {
  //看父类异常类型  都是属于运行时异常  同类异常都行
  void  login() throws  NullPointerException;
  void  register() throws  IllegalArgumentException;
  void  update() throws   IndexOutOfBoundsException;

  void   delete() throws ParseException;

}
class  Demo2Impl  implements  Demo2{


  /**
   *
   * @throws NullPointerException
   * @throws IllegalArgumentException
   */

  @Override
  public void login() throws IllegalArgumentException,RuntimeException{

  }
  @Override
  public void register() throws IllegalArgumentException,IndexOutOfBoundsException {

  }

  @Override
  public void update() throws ArrayIndexOutOfBoundsException {

  }

  @Override
  public void delete() throws ParseException, RuntimeException {   //编译时间的问题  先编译在运行

  }

//  public static void main(String[] args) {
//
////    try {
////      throw new Test();
////    }
////    catch(Test t) {
////      System.out.println("Got the Test Exception");
////    }
////    finally {
////      System.out.println("Inside finally block ");
////    }
//    // some other stuff
////    try {
////      // Some monitored code
////      throw new Derived();
////    }
////    catch(Base b)     {
////      System.out.println("Caught base class exception");
////    }
////    catch(Derived d)  {
////      System.out.println("Caught derived class exception");
////    }
//    try
//    {
//      int a = 0;
//      System.out.println ("a = " + a);
//      int b = 20 / a;
//      System.out.println ("b = " + b);
//    }
//
//    catch(ArithmeticException e)
//    {
//      System.out.println ("Divide by zero error");
//    }
//
//    finally
//    {
//      System.out.println ("inside the finally block");
//    }
//
//  }
}
//class Test extends Exception { }
//class Base extends Exception {}
//class Derived extends Base  {}

class Test
{
  String str = "a";
  void A(){
    try{
      str +="b";
      B();
    }catch (Exception e){
      str += "c";
    }
  }

  void B() throws Exception{
    try{
      str += "d";
      C();
    }catch(Exception e){
      throw new Exception();
    }finally{
      str += "e";
    }
    str += "f";
  }
  void C() throws Exception{
    throw new Exception();
  }

  void display(){
    System.out.println(str);
  }

  public static void main(String[] args) {
    Test object = new Test();
    object.A();
    object.display();

//      String   str="a";
//      try {
//          str+="b";
//        new  Test().show();
//      }catch (Exception e){
//        str+="f";
//        try {
//          throw new Exception();
//        } catch (Exception ex) {
//          ex.printStackTrace();
//        }
//      }finally {
//        str+="c";
//      }
//    str+="d";
//    System.out.println(str);

  }

  //}
  public void   show()  throws  Exception{
    throw  new  Exception();
  }


}

//  public static void main(String[] args) {
//    int test = test(3,5);
//    System.out.println(test);
//  }
//
//  public static int test(int x, int y){
//    int result = x;
//    try{
//      if(x<0 || y<0){
//        return 0;
//      }
//      result = x + y;
//      return result; //8
//    }finally{
//        result = x - y; //-2
//    }
//  }


//  public static void main(String[] args) {
//    int[] arr ={1,1,1,1};
//
//    try{
//      for(int i = 0 ; i < 5;i++){
//        System.out.println(arr[i]);
//      }
//    }catch (Exception e){
//      e.printStackTrace();
//    }
//    System.out.println("这是个异常，不是错误");
//  }
//

//  static void methodA() {
//    try {
//      System.out.println("进入方法A");
//      throw new RuntimeException("制造异常");
//    } finally {
//      System.out.println("用A方法的finally");
//    }
//  }
//  static int methodB() {
//    try {
//      System.out.println("进入方法B");
//      // throw new Exception();
//      return 1;
//    } catch (Exception e) {
//      return 3;
//    } finally {
//      System.out.println("调用B方法的finally");
//      // return 2;
//    }
//  }
//
//  public static void main(String[] args) {
//    try {
//      methodA();
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//    int i = methodB();
//    System.out.println(i);
//  }

//

//}
//class Test {
//  public static String output = "";
//
//  public static void foo(int i) {
//    try {
//      if (i == 1)
//        throw new Exception();
//      output += "1";
//    } catch (Exception e) {
//      output += "2";
//      // return;
//    } finally {
//      output += "3";
//    }
//    output += "4";
//  }
//
//  public static void main(String args[]) {
//    foo(0);
//    System.out.println(output);//
//    foo(1);
//    System.out.println(output);//
//  }