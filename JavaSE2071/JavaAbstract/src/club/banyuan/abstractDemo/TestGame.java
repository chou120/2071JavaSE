package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:32 上午
 */
public class TestGame {

  public static void main(String[] args) {
    Person person1 = new Person("吕布",new  HalberdWeapon());
    Person person2 = new Person("关羽",new Broadsword());

    while(person1.getHp()>0 && person2.getHp()>0){
      person1.attack(person2);
     if(person2.getHp()>0){
       person2.attack(person1);
     }
    }
    if(person1.getHp()>0){
      System.out.println(person1.getName()+"还活着,血量还剩:"+person1.getHp());
    }else{
      System.out.println(person2.getName()+"还活着,血量还剩:"+person2.getHp());
    }
  }
}
