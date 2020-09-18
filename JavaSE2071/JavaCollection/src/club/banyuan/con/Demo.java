package club.banyuan.con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 9:30 上午
 */
public class Demo {

  public static void main(String[] args) {
      //
    Collection<Integer>  con=new ArrayList();
    con.add(54);
    con.add(12);
    con.add(56);
    con.add(6);
    con.add(256);

//    for (Integer ob :con) {
//      System.out.println(ob);
//    }
    Collections.sort((List<Integer>)con);     // 989889  212  4332  66556
    //con.clear();
    //System.out.println(con.size());
    con.add(123);
    //String[] ints=new String[con.size()];
    //String[] ts = con.toArray(ints);
    //Object[] objects = con.toArray();  //
    //System.out.println(Arrays.toString(ts));

    Collection<Integer> students=new ArrayList<>();
    students.add(12);
    con.addAll(students);

    con.removeAll(students);

    ((List<Integer>) con).add(2,567);

    Integer set = ((List<Integer>) con).set(2, 888);

    System.out.println(set+"-----"+con+"》》》"+con.contains(888));

    for (int i = 0; i <con.size(); i++) {
      System.out.println(((List<Integer>) con).get(i));
    }

    ((List<Integer>) con).subList(2, 5);

    Consumer<Integer> consumer=(integer)->{
      System.out.println("----"+integer);
    };
    //consumer.accept(12);
    con.forEach(consumer);

//    ((List<Integer>) con).sort(new Comparator<Integer>() {
//      @Override
//      public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//      }
//    });

    ((List<Integer>) con).sort((o1,o2)-> o2-o1 );


    Iterator<Integer> iterator = con.iterator();  //迭代器
    while (iterator.hasNext()){
      //con.remove(56);//java.util.ConcurrentModificationException
      System.out.println(iterator.next());
    }


    Collection<Student> studentCollection=new ArrayList<>();
    studentCollection.add(new Student("caorongrong", "9527"));
    studentCollection.add(new Student("朱一飞", "9517"));
    studentCollection.add(new Student("洋溢", "9537"));
    studentCollection.add(new Student("微微", "9427"));
    studentCollection.add(new Student("刘航", "9529"));
    studentCollection.add(new Student("刘航", "9529")); //线性集合的特性 ArrayList集合允重复数据

//    Collections.sort((List<Student>) studentCollection, new Comparator<Student>() {
//      @Override
//      public int compare(Student o1, Student o2) {
//        int num=o1.getName().length()-o2.getName().length();
//        //如果字符串的长度相同
//        int i =  num ==0 ? o1.getName().compareTo(o2.getName()) : num;
//        return i;
//      }
//    });

    Collections.sort((List<Student>)studentCollection,(o1,o2)->{
      int num=o1.getName().length()-o2.getName().length();
      //如果字符串的长度相同
      int i =  num ==0 ? o1.getName().compareTo(o2.getName()) : num;
      return i;
    });
    System.out.println(studentCollection);
  }
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