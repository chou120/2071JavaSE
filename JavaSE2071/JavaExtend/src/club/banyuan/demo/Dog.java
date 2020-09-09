package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 2:34 下午
 */
public class Dog extends Animal{

  public   String  address="垃圾桶";
  //static  int  height=22;

  public  void  createNature(){ //当父类的方法满足不了子类特有的功能时候  要重写父类方法
    System.out.println("我要吃小动物...");
  }


//  public  static  void  method(){
//    System.out.println("我是子类静态方法...");
//  }



}
