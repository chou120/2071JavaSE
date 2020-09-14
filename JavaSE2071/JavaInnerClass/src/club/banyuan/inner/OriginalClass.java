package club.banyuan.inner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/14 3:37 下午
 */
public class OriginalClass {

  private static int t1 = 100;
  private int t2 = 200;

  class OriginalInner {  //内部类的等级是不是跟外部类的成员的等级是一样的？ 内部类的等级和普通类一样

    static  final  int t1 = 600;  //  static+final 除外  可以使用

    private int t2 = 700;

    public  void test() {
      /*
           * 不合法的表示，在成员内部类中不可以定义静态的变量和方法
          public static int inner = 100;
          public static void print() {
          }
          */
      //合法的final变量
      //   public static final int inner1 = 300;
      System.out.println("OriginalInner:>>>>>" + t1);//直接访问外部类静态变量   600
      System.out.println("OriginalInner:>>>>" + t2);//直接访问外部类成员变量  700
      action();//直接访问外部类方法
      System.out.println(this.t1+"OriginalInner:---" + OriginalClass.this.t1);//  100
      System.out.println("OriginalInner:----" + OriginalClass.this.t2);// 200
      OriginalClass.this.action();
    }
  }

  public void action() {
    System.out.println("originalInner action");
  }

  public static void main(String[] args) {
    OriginalClass.OriginalInner originalInner = new OriginalClass().new OriginalInner();
    originalInner.test();

  }
}

class Outer {

  private String name = "贾克斯Outer";

  class Inner {

    private String name = "贾克斯Inner";

    public void method() {
      String name = "贾克斯method";
      System.out.println(name);//
      System.out.println(this.name);
      System.out.println(Outer.this.name);
    }
  }

}

class TestOuter{

  public static void main(String[] args) {
    new Outer().new Inner().method(); //  贾克斯method   贾克斯Inner  贾克斯Outer
  }
}
