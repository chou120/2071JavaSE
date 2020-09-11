package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:32 上午
 */
public class TestGame {

  /**
   * 武器 添加 攻击技能
   *  Person 具有闪避的状态
   *
   *  1.对人物造成的伤害得到百分之20回血
   *  2.破甲  造成伤害  当护甲值低于初始值的一半的时候造成真实伤害  否则破甲伤害减免60%
   *  额外功能  闪避
   * 人物 有护甲  护甲初始不一样
   *
   * @param args    测试
   *
   */

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
