package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 2:39 下午
 */
public class Animal {

  /**
   * 子类继承父类所有的非私有化成员  除了构造方法
   *
   * 如果子类和父类有重名属性 请问测试类调用属性最终是哪一个类的属性
   *  优先使用子类自身的 不会去父类找
   *
   *  方法重写: 子类重写父类中的方法  方法名一样  参数列表一样  返回值一样  只不过是方法体不一样而已
   *  方法重载: 方法名一样 参数列表不一样  跟返回值没有关系
   *
   *  思考:请问父类的静态方法能被子类重写嘛？或者说静态方法存不存在重写一说?为什么？
   *  不存在.理由:跟加载前后顺序有关  static  属于类
   *
   */

  private  String  name="动物";
  private  String  age="3";
  public   String  address="下水道";

  static  int  height=21;


  public Animal() {
  }

  public Animal(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public  void  createNature(){
    System.out.println("我要生小动物...");
  }


  public  static  void  method(){
    System.out.println("我是父类静态方法...");
  }




  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age='" + age + '\'' +
        '}';
  }
}
