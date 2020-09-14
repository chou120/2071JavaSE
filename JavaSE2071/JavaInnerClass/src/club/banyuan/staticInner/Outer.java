package club.banyuan.staticInner;

import club.banyuan.staticInner.Outer.Inner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/14 3:53 下午
 */
public class Outer {

  //特征：在类的内部中存在另一个类，且该类被static修饰
  // 使用范围：在外部类内，可以**直接使用**内部类，
  // 在外部类范围以外使用`外部类名.静态内部类名`的方式使用内部类

  private int number = 22;
  static String name = "李四";
  static final char sex = '女';

  static class Inner {
    private int number = 12;
    static String name = "张三";
    static final char sex = '男';

    public void showInfo() {
      System.out.println(sex+"我是静态内部类的普通方法..." + new Outer().number + ">>>>" + name);
    }
    public static void method() {
      System.out.println("我是静态内部类的静态方法..." + ">>>>" + Outer.name);
    }
  }
}

class TestOuter {
  public static void main(String[] args) {
    Outer.Inner inner = new Outer.Inner();
    inner.showInfo(); //调用静态内部类的 非静态成员
    Outer.Inner.method();
    System.out.println(Outer.Inner.name);

  }
}
