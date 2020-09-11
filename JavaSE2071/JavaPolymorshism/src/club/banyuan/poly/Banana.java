package club.banyuan.poly;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 2:11 下午
 */
public class Banana extends  Food {

  public String  city="苏州...";

  public  void  changeColor(){
    System.out.println("香蕉变色...");
  }

  public  static void attack(){
    System.out.println("子类静态方法...");
  }


  public   void  huaPi(){
    System.out.println("画皮....");
  }


}
