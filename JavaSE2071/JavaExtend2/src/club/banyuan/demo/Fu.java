package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 10:30 上午
 */
public class Fu {

  private  String  name="张大炮";

  public Fu(){
    //super();
    System.out.println("这是父类的无参构造函数...");
  }

  public Fu(String name) {
    this.name = name;
    System.out.println("这是父类的有参构造器");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }






}
