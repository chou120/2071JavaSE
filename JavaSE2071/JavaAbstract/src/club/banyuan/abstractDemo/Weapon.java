package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:17 上午
 */
public abstract class Weapon {

  private   String   name;

  public  static final   String  felid="属性";

  private static void  method(){

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Weapon(String name) {
    this.name = name;
  }

  public Weapon() {
    System.out.println("我是武器的无参构造器...");
  }

  //抽象方法
  public abstract void  attack(Person person1,Person person2);
  //{
//    int attack = person1.attack();//自身攻击力
//    int hp = person2.getHp();
//    person2.setHp(hp-attack);
//
//  }



}
