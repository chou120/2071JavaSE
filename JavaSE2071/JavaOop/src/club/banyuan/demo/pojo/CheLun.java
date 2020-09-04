package club.banyuan.demo.pojo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 2:08 下午
 */
public class CheLun {

  private  String  name="张三";
  private  String color;  //默认值是null   int  0  double 0.0  char  '\u0000'  boolean  false
  private final double redio=3.14;

  public  String   getStr(){
    final String  username="张三"; //请问局部变量username 有默认值嘛
    return username;
  }

  public double getRedio() {
    return redio;
  }

  public String getName() {
    return name;
  }
  public String getColor() {
    return color;
  }

  public void setName(String name) {  //
    this.name = name;  //表示当前对象
  }
  public void setColor(String color) {
   this.color = color;
  }

//  public String showInfo(){  //所有的功能性代码里面  最好不要出现输出语句
//   // System.out.println("----");
//    return "";
//  }


  @Override  //重写
  public String toString() {
    return "CheLun{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", redio=" + redio +
        '}';
  }
}
