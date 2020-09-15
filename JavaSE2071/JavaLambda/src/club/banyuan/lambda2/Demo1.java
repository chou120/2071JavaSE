package club.banyuan.lambda2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/15 1:56 下午
 */
public class Demo1 {

  /**
   * Function<T,R>:函数型接口 定义了 R apply(T t) 抽象方法，它接受一个 泛型T的对象， 并返回一个泛型R的对象。
   * 如果需要将接收对象转换成其它对象可以使用
   *
   * @param args Consumer<T> : 消费型接口 void accept(T t); Consumer：定义了 void accept(T t)
   *             抽象方法，需要访问某对象并对其进行某些操作时可以使用
   *             <p>
   * Supplier<T> : 供给型接口 T get(); Supplier：定义了 T get() 抽象方法，不接收参数返回Lambda表达式的值
   *
   *
   *  Predicate<T> : 断言型接口
   *   boolean test(T t);
   *  Predicate：定义了 boolean test(T t) 抽象方法，需要表示一个涉及类型T的布尔表达式时可以使用
   */


  public static void main(String[] args) {
    Function<String, Boolean> function = (str) -> "张三".equals(str);
    System.out.println(function.apply("张三"));

    Random random = new Random();
    Employee[] em = new Employee[5];
    for (int i = 0; i < em.length; i++) {
      Employee employee1 = new Employee("" + i, "张安" + i, random.nextInt(8000) + 4000,
          random.nextInt(10) + 1);
      em[i] = employee1;
    }
    Function<Employee[], Employee> function1 = (employees) -> {
      Employee year = employees[0];
      for (int i = 0; i < employees.length - 1; i++) {
        if (year.getYear() < employees[i + 1].getYear()) {
          year = employees[i + 1];
        }
      }
      return year;
    };
    Employee apply = function1.apply(em);
    System.out.println("------------------------------------");
    Consumer<Employee[]> consumer = (employees) -> {
      //冒泡
      for (int i = 0; i < employees.length; i++) {
        for (int j = 0; j < employees.length - i - 1; j++) {
          if (employees[j].getYear() < employees[j + 1].getYear()) {
            Employee employee = employees[j];
            employees[j] = employees[j + 1];
            employees[j + 1] = employee;
          }
        }
      }
    };
    // consumer.accept(em);
    sort(consumer, em);
    System.out.println(Arrays.toString(em));
    System.out.println("------------------------------------");

    Supplier<Employee> supplier= ()-> new Employee("21", "汗", 2, 3);
    System.out.println(supplier.get().toString());

    System.out.println("------------------------------------");

//案例 找出字符串数组中长度满足大于6的所有的字符串的数组
    String [] st={"da","asdawa","张三你个大保健","adwgvsdg","李四是钻石王老五"};
    Predicate<String> predicate1=(str)->str.length()>=6;

    String[] strings = get(st, predicate1);
    System.out.println("----"+Arrays.toString(strings));

  }
  public  static  String [] get(String [] strings,Predicate<String> predicate){
    String[] str=null;
    for (String s : strings)
      if (predicate.test(s)) {
        if (str == null) {
          str = new String[1];
          str[0] = s;
        } else {
          str = Arrays.copyOf(str, str.length + 1);
          str[str.length-1] = s;
        }
      }
    return  str;
  }

  public static void sort(Consumer<Employee[]> consumer, Employee[] employees) {
    consumer.accept(employees);
  }


}

class Employee {

  private String empId;
  private String eName;
  private double price;
  private int year;

  public Employee() {
  }

  public Employee(String empId, String eName, double price, int year) {
    this.empId = empId;
    this.eName = eName;
    this.price = price;
    this.year = year;
  }

  public String getEmpId() {
    return empId;
  }

  public void setEmpId(String empId) {
    this.empId = empId;
  }

  public String geteName() {
    return eName;
  }

  public void seteName(String eName) {
    this.eName = eName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empId='" + empId + '\'' +
        ", eName='" + eName + '\'' +
        ", price=" + price +
        ", year=" + year +
        '}';
  }
}