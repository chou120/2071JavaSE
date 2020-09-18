package club.banyuan.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 10:50 上午
 */
public class Demo {

  public static void main(String[] args) {

//    ArrayList<String> a1 = new ArrayList<String>();
//    a1.add("a");
//    a1.add("b");
//    a1.add("c");
//    sop(a1);
//
//    ArrayList<Integer> a2 = new ArrayList<Integer>();
//    a2.add(1);
//    a2.add(2);
//    a2.add(3);
//    sop(a2);

    ArrayList<Student> a3=new ArrayList<>();
    a3.add(new Student("张三丰", "5678"));

    ArrayList<Object> a4=new ArrayList<>();

    ArrayList<? extends Student> arrayList=a3;//向上限定

    ArrayList<SmallStudent> a5=new ArrayList<>();

    ArrayList<? super  Student> arrayList1=a4;  //向下限定   只能是Student和其父类

//  arrayList.add(new Object());
//  arrayList.add(new SmallStudent());


    sop(a3);



  }

  //占位符，也称为通配符。表示元素类型可以匹配任意类型
  public static void sop(ArrayList<?  extends  Student> a){  //  T  是不是表示有类型传递过来   ？你能知道？接受的是什么吗？
  //a.add();  使用问好通配符不能做添加操作
   // Object remove = a.remove(1);
   // a.set(2, 3);

   // System.out.println(">>>>>>"+remove);;
    for(Iterator<? extends  Student> it = a.iterator();it.hasNext();){
      Student next =it.next();
      System.out.println(it.next());
    }
  }

//  public static <T> void vistor(ArrayList<T> a){
//    Iterator<T> iterator = a.iterator();
//    while(iterator.hasNext()){
//      T t = iterator.next();
//      System.out.println(t);
//    }
//  }


//  public static void printList(ArrayList list){
//    Iterator iterator = list.iterator();
//    while (iterator.hasNext()) {
//      Object object = (Object) iterator.next();
//      System.out.println(object);
//    }
//  }

}
class Student{
  private String name;  //根据名字长度来排序或者是内容  然后根据学号排序
  private String stuNumber;

  public Student() {
  }

  public Student(String name, String stuNumber) {
    this.name = name;
    this.stuNumber = stuNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStuNumber() {
    return stuNumber;
  }

  public void setStuNumber(String stuNumber) {
    this.stuNumber = stuNumber;
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
        Objects.equals(stuNumber, student.stuNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stuNumber);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", stuNumber='" + stuNumber + '\'' +
        '}';
  }
}

class SmallStudent extends  Student{

}