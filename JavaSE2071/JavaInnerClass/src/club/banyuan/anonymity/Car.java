package club.banyuan.anonymity;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/14 4:20 下午
 */
public  abstract  class Car {

  public  abstract  void  show1();
  public  abstract  void  show2();
  public  abstract  void  show3();
  public  abstract  void  show4();

}

interface  A{
  void login(User   user);
}

class  TestCar{

  public static void main(String[] args) {
//      Car  car=  new Car() {  //没有具体子的实现类
//          @Override
//          public void show1() {
//            System.out.println("我是匿名内部类方法..");
//          }
//
//          @Override
//          public void show2() {
//
//          }
//
//          @Override
//          public void show3() {
//
//          }
//          @Override
//          public void show4() {
//
//          }
//        };
    User user = new User();
    user.setName("张三");
    user.setPassword("123");
    new A() {
      @Override
      public void login(User user) {
        System.out.println(user.toString());
      }
    }.login(user);

  }

}

class  User{

  private   String  name;
  private  String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String
  toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}