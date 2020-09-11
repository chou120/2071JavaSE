package club.finalDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 3:44 下午
 */
public   class Person {
  /**
   * 修饰方法 可以继承,重载  但是不能重写
   * 修饰类  不能被继承
   * 修饰成员变量  变量不能被修改 变量在使用前一定是有值的
   */
  private  final  String  name="常量值";
//  public final   void method(){
//    System.out.println("final ----->>>>> method");
//  }



  public final   void method(final int num){
   // num=213;
    System.out.println("final ----->>>>> method"+num);
  }
  public final   void method(final Cat  cat){

    // num=213;
    //cat=new Cat();
    cat.setName("王五");
    System.out.println("final ----->>>>> method"+cat.getName());
  }





}
