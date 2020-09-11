package club.banyuan.priutice;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 4:08 下午
 */
public class Person {


  private final double re;
  private final double im;  //  如果使用无参构造器 final修饰的一定要有数据 不然无法使用

  public Person(double re, double im) {
    this.re = re;
    this.im = im;
  }
  public void show() {
    method();
  }
  public void method() {
    System.out.println("张三丰");
  }
}


class  Main{
  public static void main(String[] args) {
    Person c = new Person(10, 15);
    System.out.println("Complex number is " + c);
  }
}

//
//
//class Son extends Person {
//
//  public void show() {
//    super.method();
//  }
//
//  public void method() {
//    System.out.println("贾克斯");
//  }
//}
//
//class GrandSon extends Son {
//
//  public void method() {
//    System.out.println("加特林");
//  }
//}
//
//class Test {
//
//  public static void main(String[] args) {
//    Person person = new GrandSon();
//    person.show();
//
//  }
//}

