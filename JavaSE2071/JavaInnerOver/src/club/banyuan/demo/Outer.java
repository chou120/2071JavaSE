package club.banyuan.demo;

import club.banyuan.demo.Outer.Inner2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/15 9:38 上午
 */
public class Outer {


  /**
   * 1.成员内部类 2.静态内部类 3.方法内部类 4.匿名内部类
   */
  class Inner {  //当成普通的类来处理

  }

  private static int number = 2;

  public static class Inner2 {  // 静态内部类成员访问外部类成员的 时候 外部类成员只能静态的

    static int num = 12;

    public void show() {
      System.out.println(number);
    }

    public static void getLogin() {   //静态的只能调用静态的
      System.out.println(number);
    }
  }

  interface Inner7 {

    void register();
  }

//  class  Inner8 implements  Inner7{
//
//    @Override
//    public void register() {
//
//    }
//  }


 Inner7  inner7=new Inner7(){
   @Override
   public void register() {

   }
 };



  public Inner7 getInner7() {
    return inner7;
  }

  public void method() {

    String address = "这里是常量";
    class Inner3 {


    }
    class Inner4 extends Inner3 {

    }

    abstract class Inner5 {

      public abstract void login();
    }

    class Inner6 extends Inner5 implements Inner7 {

      @Override
      public void login() {

      }

      @Override
      public void register() {

      }
    }
  }

  //  不存在一个具体的子类   直接使用接口名或者抽象类名去穿件匿名内部类对象
}

class OuterInner {
  public static void main(String[] args) {
    Outer.Inner in = new Outer().new Inner();
    int num = new Inner2().num;//创建静态内部类对象
    System.out.println(Inner2.num);
    boolean  flag=check(new UserDao() {
      @Override
      public boolean login(String name, String password) {
        if(name.equals("张三")&& password.equals("123456")){
          return  true;
        }
        return false;
      }
    }, new  User("123456","张三"));
    System.out.println("登录"+flag);
  }
  //调用登录案例
  public  static  boolean  check(UserDao u,User  user){
    return  u.login(user.getUsername(),user.getPassword());
  }
}
class User{
  private String password;
  private  String username;

  public User(String password, String username) {
    this.password = password;
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}

interface  UserDao{
  boolean login(String name,String password);
}