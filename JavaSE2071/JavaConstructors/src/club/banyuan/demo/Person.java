package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/7 2:16 下午
 */
public class Person {

  private String name;
  private double address;

  public Person() {
  }

  public Person(String name, double address) {
    this.name = name;
    this.address = address;
  }
  //  public Person() { // 无参构造器
//    System.out.println("构造器...");
//  }

//  public Person(String  name,double address){
//    this.name=name;
//    this.address=address;
//  }

//  public Person(String name) {
//    this.name = name;
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAddress() {
    return address;
  }

  public void setAddress(double address) {
    this.address = address;
  }

//  public Person(double address) {
//    this.address = address;
//  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

class  Test{

  public static void main(String[] args) {
    Person person = new Person();  //每个class里面都有构造器  用于创建class 文件对象

//    new  Person("你好");  //  匿名对象  用了就丢  被jvm当成垃圾回收了
//    new  Person("张三", 3.42);  //匿名对象
//

  }
}