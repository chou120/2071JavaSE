package club.banyuan.lambda4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 9:17 上午
 */
public class Demo {

}

interface MyFunc {
  MyClass func(int n);
}
class MyClass {
  private int val;
  MyClass(int v) {
    val = v;
  }
  MyClass() {
    val = 0;
  }
  public int getValue() {
    return val;
  }
}
class ConstructorRefDemo {
  public static void main(String[] args) {
    MyFunc myClassCons = MyClass::new;
    MyClass mc = myClassCons.func(100);
    System.out.println("value in mc is: " + mc.getValue());
  }
}
@FunctionalInterface
interface  NoParam{
  MyClass func();
}
class  TestNoParam{

  public static void main(String[] args) {
    NoParam myClassCons = MyClass::new;  //如果函数式接口里面的方法有参那么就是引用有参构造函数  相反是无参构造函数
    myClassCons.func();
  }
}
