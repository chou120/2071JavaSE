import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 2:15 下午
 */
@FunctionalInterface
public interface UserDao {
  boolean  add(User  user,String   name);
}


class  Test  extends  User{

  public static void main(String[] args) {

    UserDao userDao = new UserDao() {
      @Override
      public boolean add(User user,String name) {
        System.out.println("哈哈哈是");
        return  true;
      }
    };

    UserDao add = (User user,String name)->{  //大括号里面是方法体的实现
    user.setName(name);
     return   true;
   };
   add.add(new User(),"塞力斯");
  
    IntBinaryOperator intBinaryOperator = Math::max;
    System.out.println( intBinaryOperator.applyAsInt(12, 43));

    //构造方法引用
    App<String,User> app = User::new;  //用来构造对象的  返回的肯定也是对象
    app.login("张三丰");  //


  }

  public  void  show(){
    User user = new User();
    Consumer<String> setName = super::setName; //实例方法引用   对姓名::方法名
    setName.accept("张安");
    System.out.println(user.getName());
  }

}

interface  App<String,User>{
  User login(String name);
}

class User{

  private  String  name;

  public User(String name) {
    this.name = name;
  }

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}