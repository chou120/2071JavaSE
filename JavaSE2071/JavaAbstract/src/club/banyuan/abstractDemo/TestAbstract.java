package club.banyuan.abstractDemo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/11 1:49 下午
 */
public class TestAbstract {

  public static void main(String[] args) {
    //Weapon weapon = new Weapon(); //抽象类不能被创建对象

    Weapon weapon= new Broadsword();
    Weapon halberdWeapon = new HalberdWeapon();

    Person zhangsan = new Person("张三", weapon);
    Person lisi = new Person("lisi", halberdWeapon);

    weapon.attack(zhangsan, lisi);
    halberdWeapon.attack(lisi, zhangsan);

    //抽象类的子类可以有哪些？




  }


}
