package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 2:16 下午
 */
public interface AddNewSkill {  //接口里面是对行为的抽象   抽象类是对 对象的抽象

   public   final  static  String  NAME="han";
   // 添加新技能
   public  abstract   int  addSkill();  //前后端分离   一个接口名字

   // 添加伤害

   // 撤销攻击

   //jdk1.8以后可以在其子类调用方法
  default void  method(){
      System.out.println("哈哈是撒谎时");
   }

}
class Test{

   public static void main(String[] args) {
      System.out.println(AddNewSkill.NAME);
   }
}

