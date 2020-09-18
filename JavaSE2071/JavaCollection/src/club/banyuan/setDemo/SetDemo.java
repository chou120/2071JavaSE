package club.banyuan.setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 3:35 下午
 */
public class SetDemo {

  public static void main(String[] args) {

    ArrayList<String> objects = new ArrayList<>();
    objects.add("java");
    objects.add("C");
    objects.add("C");
    objects.add("C++");
    objects.add("C++");
    objects.add("JS");
    objects.add("VB");

    Set<String> set=new HashSet<>(objects);
//    set.add("java");
//    set.add("C");
//    set.add("C++");
//    set.add("JS");
//    set.add("VB");
    //set.add("JS");
    Set<Student>  studentSet=new  HashSet<>();
    studentSet.add(new Student("张qfq三1", "123456"));
    studentSet.add(new Student("张wq三2", "123456"));
    studentSet.add(new Student("张11112aa三2", "123456"));
    studentSet.add(new Student("张三asdas4", "123456"));
   // studentSet.forEach(System.out::println);

    studentSet.stream().sorted((o1,o2)->o2.getName().length()-o1.getName().length()).forEach(System.out::println);

    //Iterator<Student> iterator = studentSet.iterator();
    //System.out.println(studentSet);
    LinkedHashSet<String> objects1 = new LinkedHashSet<>();
    objects1.add("java");
    objects1.add("java1");
    objects1.add("java1");
    objects1.add("java2");
    objects1.add("java3");
    objects1.forEach(System.out::println);




  }

}

class Student{

  private String name;
  private String password;

  public Student() {
  }

  public Student(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
    return Objects.equals(name, student.name) &&
        Objects.equals(password, student.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
