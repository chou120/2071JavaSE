package club.banyuan.demo;

import java.util.Random;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 11:16 上午
 */
public class Person {

  private int  hp=1000; //初始血量
  private String name;
  private Weapon  weapon; //人员需要有武器
  private Random random=new Random();
  public Weapon getWeapon() {
    return weapon;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public Person(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void  attack(Person person){
    weapon.attack(this,person); //人员使用武器进行攻击
  }

  public  int   attack(){ //人员的本身的具有的随机攻击力
    return  random.nextInt(100)+100;
  }


}
