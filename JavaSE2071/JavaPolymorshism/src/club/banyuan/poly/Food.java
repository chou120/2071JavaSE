package club.banyuan.poly;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 2:06 下午
 */
public class Food {

  /**
   * 实现多态的前提: 1.要有继承  2.发生方法重写  3.父类引用指向子类对象
   *
   */

  public String  city="上海";

  private  String  name;
  private  String  color;

  public Food() {
  }

  public Food(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public  void  changeColor(){
    System.out.println("食物变色...");
  }

  @Override
  public String toString() {
    return "Food{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        '}';
  }


  public  static void attack(){
    System.out.println("父类静态方法...");
  }


}
