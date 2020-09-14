package club.banyuan.methodInnerClass;

import club.banyuan.demo.Inner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/14 4:03 下午
 */
public class Outer {

  /**
   * **-方法内部类**
   * <p>
   * 语法：存在于方法体内部的类
   * <p>
   * 使用范围：方法内部类只能在定义的方法内被使用
   * <p>
   * 访问范围：
   * <p>
   * 如果包含内部类的方法是实例方法，那么可以访问外部类的静态变量和方法，也可以访问实例变量和方法；
   * <p>
   * 如果包含内部类的方法是静态方法，那么只能访问外部类的静态变量和方法。
   * <p>
   * 方法内部类还可以直接访问方法的参数和方法中的局部变量，但是这些变量必须声明为final。为什么需要声明为final呢？
   * 这是因为方法内部类操作的并不是外部的变量，而是它自己的实例变量，只是这些变量的值和外部一样，对这些变量赋值，并不会改变外部的值，
   * 为避免混淆，所以干脆强制规定必须声明为final。 我们知道被final修饰的基本类型变量的值是不能被修改的，
   * 被final修饰的数组或者引用类型变量的引用是不能修改的，
   * 即只能指向一个对象或者是数组，但是我们可以修改对象中的成员变量值或者是数组中元素的值。
   *
   * 其实使用final来修饰参数以及局部变量的目的还是保证方法内部类外面的元素不会在方法内部类中被修改，
   * 相当于限制一个作用域的功能，保证方法内部类内部的的修改不会影响方法内部类外面的同名变量值。
   */
  public void method(String  str) {
    final  String   address="下水道...";
    class Inner {  //局部内部类
      private String InnerName = "张三";
      private String InnerAge = "21";

      public void show(String name) {
       // address="无星级宾馆";
        System.out.println("只有普通方法..."+name+"住在"+address);
      }
    }
    Inner inner = new Inner();
    inner.show(str);
  }
}

class  TestOuterInner{

  public static void main(String[] args) {
   new Outer().method("老周");//


  }
}