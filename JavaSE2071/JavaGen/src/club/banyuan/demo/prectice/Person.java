package club.banyuan.demo.prectice;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 4:17 下午
 */
public class Person{

  private  String name;



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }


}
