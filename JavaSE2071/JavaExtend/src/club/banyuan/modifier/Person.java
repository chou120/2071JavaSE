package club.banyuan.modifier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 3:10 下午
 */
public class Person {

  /**
   *              在本类中      在同包子类中    不同包子类中     不同包的不同类
   * private        ✅
   * 默认            ✅           ✅
   * protected      ✅           ✅             ✅
   * public         ✅           ✅             ✅               ✅
   *
   *
   */

  private String name = "张三";  //只能在本类访问
  String password = "123456";
  protected String address = "栖霞区";
  public String city = "南京";  //当前项目下任意位置可访问

  public void method1() {
    System.out.println("我是public方法....");
  }

  void method2() {
    System.out.println("我是默认方法....");
  }

  private void method3() {
    System.out.println("我是private方法....");
  }

  protected void method4() {
    System.out.println("我是protected方法....");
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



}
