package club.banyuan.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 1:37 下午
 */
public class StreamAPIDemo {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("123");
    list.add("21312");
    list.add("1");
    list.add("12223");
    list.add("82423");

  //  Stream<String> stream = list.stream(); //  顺序流

    //stream.forEach(System.out::println);

//    Stream<String> parallelStream = list.parallelStream(); //获取一个并行流 也叫随机流
//    Consumer<? super  String> tConsumer = (string) -> {
//      System.out.println(Thread.currentThread().getName() + "--" + string);
//    };
//
//    parallelStream.forEach(
//        tConsumer
//    );  // 线程 fork-join   只要执行这个最终操作的方法  就代表流关闭了

//    List<String> collect = parallelStream.collect(Collectors.toList());  //收集
//    System.out.println(collect);


    List<Employee> emps = Arrays.asList(  //把数组转换成集合
        new Employee("102", "李四",6666.66 , 1),
        new Employee("103", "张三",4666.66 , 3),
        new Employee("104", "大保健",7890.66 , 2),
        new Employee("105", "gayLun",12121.66 , 6),
        new Employee("106", "嘉文四世",5666.66 , 4),
        new Employee("106", "嘉文四世",5666.66 , 4),
        new Employee("107", "嘉文1世",1666.66 , 8),
        new Employee("108", "嘉文2世",2666.66 , 9),
        new Employee("109", "嘉文3世",9666.66 , 10),
        new Employee("1010", "嘉文7世",7666.66 , 6),
        new Employee("1010", "嘉文7世",7666.66 , 6)

    );

	/*
	  筛选与切片
		filter——接收 Lambda ， 从流中排除某些元素。
		limit——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
	 */
    Stream<Employee> stream1 = emps.stream();
   /** Predicate<Employee> predicate=(emp)-> emp.getPrice()>7000;
    stream1.filter(
        predicate
    ).forEach(System.out::println);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>");
    stream1 = emps.stream();
    stream1.filter(predicate).limit(2).forEach(System.out::println);
    System.out.println(">>>>>>>>>>------>>>>>>>>>>>");

    stream1 = emps.stream();
    stream1.skip(3).forEach(System.out::println);

    System.out.println("以下是去重操作:");
    stream1 = emps.stream();
    stream1.distinct().forEach(System.out::println);


    ////map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
    List<String> list1 = Arrays.asList("aa", "bb", "cc", "dd");
    list1.stream().map(String::toUpperCase).forEach(System.out::println);
    List<String> collect = list1.stream().map(String::toUpperCase).collect(Collectors.toList());

    System.out.println(collect+"->>>>>>>>>>>>>--"+list1);

   // 练习1：获取员工姓名长度大于3的员工的姓名。
    Stream<Employee> stream = emps.stream();
    stream.filter((employee)-> employee.geteName().length() >3 ).forEach(System.out::println);

    System.out.println("\n");
    //sorted()——自然排序
    List<Integer> list2 = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
   // list2.stream().sorted().forEach(System.out::println);
    list2.stream().sorted((o1,o2)-> o2-o1 ).forEach(System.out::println);
*/
    Stream<Employee> stream2 = emps.stream();
    stream2.distinct().sorted(new  MyComparator()).forEach(System.out::println);


    Integer[] nums = new Integer[10];
    Stream<Integer> stream3 = Arrays.stream(nums);

    //通过 Stream 类中静态方法 of()
    Stream<Integer> stream4 = Stream.of(1,2,3,4,5,6);



    Employee[] employees = new Employee[]{
        new Employee("9527", "周星星", 8000, 5),
        new Employee("9528", "吴孟达", 7500, 9),
        new Employee("9529", "送终鸡", 3000, 11),
        new Employee("9530", "李开心", 4000, 6),
        new Employee("9531", "周吉吉", 4500, 2),
    };
    Stream<Employee> stream = Arrays.stream(employees);
    stream.filter(employee -> employee.getPrice()>=4500).forEach(System.out::println);
    System.out.println();
    stream = Arrays.asList(employees).parallelStream();
//  Optional<Employee> any = stream.findAny();  一般跟并行流在一起用
  //  stream.forEach(System.out::println);
  //  Optional<Employee> first = stream.findFirst();  //
  //  System.out.println("\n"+first.get().toString());

    long count = stream.count();
    System.out.println(">>>>>"+count);


    //把Stream中的元素进行过滤然后再转为List集合
    List<String> list5 = Arrays.asList("test","hello","world","java","tom","C","javascript","java");
    String collect = list5.stream().filter(s -> s.length() >= 4)
        .collect(Collectors.joining("|","start---","---美女"));

    System.out.println(collect);




  }
}
//在员工数组中使用lambda表达式
class  Employee implements  Comparable<Employee>{  //内部比较器
  private  String  empId;
  private  String  eName;
  private  double  price;
  private  int     year;

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Double.compare(employee.price, price) == 0 &&
        year == employee.year &&
        Objects.equals(empId, employee.empId) &&
        Objects.equals(eName, employee.eName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empId, eName, price, year);
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

  @Override
  public int compareTo(Employee o) {
    int year =this.year-o.getYear();
    int  number= year==0 ? (int)this.getPrice() - (int)o.getPrice() : year;
    return number;
  }
}


class MyComparator implements  Comparator<Employee>{  //外部比较器

  @Override
  public int compare(Employee o1, Employee o2) {
    int year =o2.getYear()-o1.getYear();
    int  number= year==0 ? (int)o2.getPrice() - (int)o1.getPrice() : year;
    return number;
  }
}