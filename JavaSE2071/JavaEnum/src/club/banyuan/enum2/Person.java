package club.banyuan.enum2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 11:04 上午
 */
enum Gender {
  FEMALE("女的"), MALE("男的"), UNKNOW("未知的"), NOTMALEN_NOEFEMALE("人妖");

  private String genderDesc;

  Gender(String genderDesc) {
    this.genderDesc = genderDesc;
  }

  public String toString() {
    return genderDesc;
  }
}

public class Person {

  private  String  username;
  private  String  password;
  private  Double  price;
  private  Gender sex; //性别

  public Person() {
  }

  public Person(String username, String password, Double price, Gender sex) {
    this.username = username;
    this.password = password;
    this.price = price;
    this.sex = sex;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Gender getSex() {
    return sex;
  }

  public void setSex(Gender sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Person{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", price=" + price +
        ", sex=" + sex +
        '}';
  }
}

class  TestPerson{

  public static void main(String[] args) {
    Person person = new Person("张三","12145",123.4,Gender.MALE);
    Person person2 = new Person("张三2","12145",121.4,Gender.FEMALE);
    Person person3 = new Person("张三3","12145",1223.4,Gender.NOTMALEN_NOEFEMALE);
    Person person4 = new Person("张三4","12145",1223.4, Gender.UNKNOW);

    System.out.println(person.getSex().toString());  //  显示在控制台   页面   显示在页面
    System.out.println(person2.toString());

    char   xex=new P().getNumber()==1?'男':'女';



  }

}

class  P{
  private  int  number;// 1  表示男的  0 表示女的

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
      this.number = number;
    }
}

