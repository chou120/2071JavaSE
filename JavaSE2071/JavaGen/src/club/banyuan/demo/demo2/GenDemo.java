package club.banyuan.demo.demo2;

import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 3:17 下午
 */
public class GenDemo<K,V> {
  private  K  k;
  private  V  v;

  public GenDemo() {

  }

  public GenDemo(K k, V v) {
    this.k = k;
    this.v = v;
  }

  public K getK() {
    return k;
  }

  public void setK(K k) {
    this.k = k;
  }

  public V getV() {
    return v;
  }

  public void setV(V v) {
    this.v = v;
  }

  @Override
  public String toString() {
    return "GenDemo{" +
        "k=" + k +
        ", v=" + v +
        '}';
  }
}
class  Student<K,V> extends GenDemo<K,V>{
//  private  String name;
//  private  String password;
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getPassword() {
//    return password;
//  }
//
//  public void setPassword(String password) {
//    this.password = password;
//  }
//
//  @Override
//  public String toString() {
//    return "Student{" +
//        "name='" + name + '\'' +
//        ", password='" + password + '\'' +
//        '}';
//  }
}
class  Test{

  public static void main(String[] args) {
    GenDemo<String,String>  genDemo=new Student<String,String>();
    genDemo.setK("张三");
    genDemo.setV("123456");

    GenDemo<String,Integer>  genDemo2=new Student<>();
    genDemo2.setK("张");
    genDemo2.setV(1231);

    System.out.println(genDemo.toString());


    Point1 point1=new Point1();
    Person person = new Person();
    person.setName("张三");
    point1.setObject(person);

   // System.out.println(point1.getObject().getName()); //并没有



  }
}

class  Point1{
  private  Object object;

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  @Override
  public String toString() {
    return "Point1{" +
        "object=" + object +
        '}';
  }
}

class  Person{

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}

