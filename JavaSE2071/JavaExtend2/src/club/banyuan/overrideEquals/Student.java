package club.banyuan.overrideEquals;

import java.util.Objects;
/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 11:20 上午
 *
 */

public class Student implements Cloneable {
  private String name;
  private int age;
  private String address;

  public Student(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  //如何重写equals
//  public boolean equals(Object object) {  //不需要考虑其地址
//
//    if (object == null) {
//      return false;
//    }
//    if (this == object) {
//      return true;
//    }
//    if (!(object instanceof Student)) {  //  Person   teacher
//      return false;
//    }
//
//    Student o = (Student) object;
//
//    return this.getName().equals(o.getName()) && this.getAge() == o.getAge()
//        && this.getAddress().equals(o.getAddress());
//  }


  @Override
  protected Object clone() throws CloneNotSupportedException {

    return super.clone();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return age == student.age &&
        Objects.equals(name, student.name) &&
        Objects.equals(address, student.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, address);
  }

  @Override
  public String toString() {
    //super.toString();
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }


}

class Test {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student stu1 = new Student("张三", 12, "栖霞");
    Student stu2 = new Student("张三", 12, "栖霞");
    System.out.println(stu1.equals(stu2));
    Object object = new Object();
    //System.out.println(stu2.getClass());
//    System.out.println(stu1.hashCode());
//    System.out.println(stu2.hashCode());
//
    Student clone = (Student) stu1.clone();
    System.out.println(clone.hashCode() + "====" + stu1.hashCode());


  }
}