package club.banyuan.exception1;


import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 1:35 下午
 */
public class Demo {

  /**
   * Throwable:
   *  异常分类:
   *      Error    硬件性 系统性的操作导致的错误  不可回逆
   *      Exception 程序员可以解决的错误
   *                运行时异常:只有在运行的时候才可能确定异常
   *                编译时异常:在编译的时候就异常
   *
   * 解决异常的办法:
   *    try{ 可能会出现异常的代码 }finally{ }
   *    try{  }catch(出现异常的类型){ 异常信息 }
   *    try{}catch(出现异常的类型){异常信息}finally{资源关闭}
   *
   *
   */
  public static void main(String[] args) {
//空指针异常   类转换异常   数组下标越界异常      InputMismatchException  java.lang.ArithmeticException: / by zero   StackOverflow
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("第一个数:");
//    int i = scanner.nextInt();
//    System.out.println("第二个数:");
//    int i1 = scanner.nextInt();
    //System.out.println(i/i1);

    String [] str={"1"};

    try {
      //System.out.println(i/i1);当程序遇到异常的时候 异常后面的程序不再执行（运行时异常属于一个的bug）
      //assert str != null;
      System.out.println(str[1]);
    }catch (Exception e){
      //System.err.println( "异常信息是:"+e.getMessage());
      //System.out.println("---"+e.fillInStackTrace()); //java.lang.ArrayIndexOutOfBoundsException: 1
      e.printStackTrace();  // 向控制台打印异常信息 可以向指定文件里面打印异常消息   异常类型  出现异常的位置 和异常出现的时间    日志.log
    }
    //jdk1.7以后
//    } catch (NullPointerException |ArithmeticException |IndexOutOfBoundsException e) {
//      e.printStackTrace();
//    }

    /**
     * +try{}catch(){}
     * java.lang.ArithmeticException: / by zero
     * 	at club.banyuan.exception1.Demo.main(Demo.java:37)
     *
     * 不+try
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * 	at club.banyuan.exception1.Demo.main(Demo.java:35)
     *
     */
    System.out.println("一个能打的都没有...");
    //如果出现了异常怎么办
    try {
      System.out.println(1/1);

    }finally {   // 不管有没有错误都会执行
      System.out.println("你猜我知不知心");
    }

  }
}
