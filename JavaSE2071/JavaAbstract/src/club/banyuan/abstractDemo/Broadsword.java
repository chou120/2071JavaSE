package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:20 上午
 */
public class Broadsword   extends  Weapon implements  AddNewSkill{

  private  int attack=90;  // 武器的初始攻击力

  public  Broadsword(){
    super("青龙偃月刀");
  }

  public  void  attack(Person  person1,Person person2){
    int attack = person1.attack()+this.attack;//总攻击力
    int hp = person2.getHp();

    person2.setHp(hp-attack);
    person1.setHp(person1.getHp()+addSkill());  //多了个回血技能

    System.out.println(person1.getName() + "使用" + getName() + "向" + person2.getName() + "发起攻击," + attack + "，剩余血量："
        + person2.getHp());

    this.attack+=20; //属性值会增加

  }

  @Override
  public int addSkill() {  //回血

    return 90;
  }

}
