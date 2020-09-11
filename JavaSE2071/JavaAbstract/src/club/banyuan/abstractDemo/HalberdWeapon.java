package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:22 上午
 */
public class HalberdWeapon extends  Weapon{

  private  int  attack=100; //武器的初始攻击力

  public HalberdWeapon(){
    super("方天画戟");
  }

  public  void  attack(Person  person1,Person person2){
    int attack = person1.attack()+this.attack;//总攻击力
    int hp = person2.getHp();
    person2.setHp(hp-attack);

    System.out.println(person1.getName() + "使用" + getName() + "向" + person2.getName() + "发起攻击," + attack + "，剩余血量："
        + person2.getHp());

    this.attack+=30; //属性值会增加

  }

}
