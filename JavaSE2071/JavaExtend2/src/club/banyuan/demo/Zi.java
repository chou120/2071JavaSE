package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 10:31 上午
 */
public class Zi extends  Fu{

  private  String name="timor";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Zi(){
    //super();
    System.out.println("子类构造函数...");
  }
  /**
   * 子类的无参构造器也是去默认的访问父类的无参构造器
   * 子类的有参构造器里面如果没有super(参数) 就表示默认的去访问 父类的无参构造器
   * @param name
   *
   * this() 表示访问当前对象在内存中的那块存储区域
   * super() 表示父类在内存中那块的存储区域
   *
   * this()  表示当前对象
   * super(); 表示父类对象
   *
   */
  public Zi(String name) {
    //super(name); //表示子类访问父类的有参构造方法  并且把局部变量的数据传递给父类的成员变量
    //this(name);
    System.out.println("子类的有参构造器");
  }

  public void  method(){
    //this()  错误位置 必须在构造函数里面使用
    System.out.println(this);
  }

  public  void  show(){
    System.out.println(getName()+"---this="+this.getName()+"--super="+super.getName());
  }



}
