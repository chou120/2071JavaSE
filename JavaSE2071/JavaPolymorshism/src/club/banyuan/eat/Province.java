package club.banyuan.eat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 3:16 下午
 */
public class Province {

  private  String   name;

  private  String   city;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Province{" +
        "name='" + name + '\'' +
        ", city='" + city + '\'' +
        '}';
  }

  public  void   kouWei(){
    System.out.println("不同省份的口味....");
  }





}
