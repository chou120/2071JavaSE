package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 2:33 下午
 */
public class Test {
  /**
   * 什么叫继承?       被继承类 叫父类 也叫基类(超类)   继承类 子类或者派生类
   *  子类继承父类的特性
   *
   */
  public static void main(String[] args) {
    Dog dog = new Dog();
//    dog.setName("哈士奇");
//    dog.setAge("3");
    System.out.println("----"+ Dog.height);
    Cat cat = new Cat();
//    cat.setName("加菲猫");
//    cat.setAge("4");
    System.out.println(cat.getName());

    dog.createNature();
    //dog.method();

    dog.height=21312;
    Dog dog1 = new Dog();

    System.out.println(dog1.height); //21    21312


  }
}
