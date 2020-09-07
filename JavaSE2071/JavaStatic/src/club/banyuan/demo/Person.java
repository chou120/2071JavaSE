package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/7 2:30 下午
 */
public class Person {

  static int count = 0;

  static {
    System.out.println("我是静态代码块..." + count++); // 0   1
  }


  public Person() {
    //从这行开始以下才是
    System.out.println("构造方法代码块" + count++);// 2     3
  }


  /**
   * 静态修饰方法
   */


  private String username = "张大炮";
  public static String ADDRESS = "下水道";

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * static   final    this   super
   */
//  private  Person(){
//    System.out.println("构造器...");
//  }
  public static void showInfo() { //静态只能调用静态的

    // System.out.println("----"+username);
    //System.out.println("----" + ADDRESS);

   // this.method(); 表示当前对象   但是  static 修饰的不属于任何一个对象  而是属于 类

  }


  public void method() {
    showInfo();
  }


  // class
  static Person getInstance() {
    return new Person();
  }

//  Person  getPerson(){
//    return new  Person();
//  }
}

class TestPerson {

  public static void main(String[] args) {
    //new Person();  //static  类名.成员名
//    Person instance = Person.getInstance();
//
//    instance.setUsername("王二麻子");
//    System.out.println(instance.getUsername());
//    /**
//     * 分析一下  被static  修饰的成员 与 非static成员的 区别
//     * static  修饰 成员变量 成员方法
//     *
//     * static 修饰的属于类成员  在创建对象之前就已经存在了  (在加载class文件的时候加载完成)
//     *
//     */
    Person.ADDRESS = "垃圾桶"; //从修改位置开始起作用 也就是说整个在结束之前 static修饰的成员一直存在
//    System.out.println(Person.ADDRESS);

    Person person = new Person();  //对象的创建依据class文件
    //System.out.println(person.ADDRESS);  //静态的成员能被所有对象共享

    //Person person2 = new Person();  //对象的创建依据class文件

    // Person person3 = new Person();  //对象的创建依据class文件

    person.method();

    /**
     * 思考1:静态方法里面能不能使用 this关键字 ？ 为什么？
     * 思考2:之前讲了构造器私有化了? 可以使用静态方法创建对象 那么请问如果不使用静态方法呢？
     * 思考3:在思考2的基础上,如果在静态方法里面不创建对象 而是直接返回对象行不行？
     *
     */




  }
}