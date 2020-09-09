package club.banyuan.modifier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 3:14 下午
 */
public class Student extends  Person{

  /**
   * 子类重写方法的访问权限一定要大于等于父类的访问权限
   */

  //发生了方法重载
  public void method1(String  name) {
    System.out.println("我是子类public方法...."+name);
  }

  public void method1(int  name) {
    System.out.println("我是子类public方法...."+name);
  }






}
