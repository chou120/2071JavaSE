package club.banyuan.poly;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 2:10 下午
 */
public class TestRice {

  public static void main(String[] args) {
//    Rice rice = new Rice();
//    rice.changeColor();
////
//    Apple apple = new Apple();
//    apple.changeColor();
//
//    Banana banana = new Banana();
//    banana.changeColor();

//      Food food = new Rice();
////    food.changeColor();
//      food = new Apple();
////    food.changeColor();
////    food = new Banana();
////    food.changeColor();
//
////     Tool.rice(rice);
////     Tool.apple(new Apple());
//      Tool.food(food);
//
//
    Food food = new Banana(); //如果使用父类引用指向子类对象
    System.out.println(food.city);
    //banana.changeColor();

    /**
     * 多态的情况下:
     *
     * 子类和父类存在同名变量时,使用是父类成员变量  那如果想要使用子类的呢？
     * 方法同名的时候，使用的是子类重写的方法
     * 如果是静态的同名方法？ 不存在重写 调用的是等号左边类的静态方法
     */

    //banana.attack();  //
//    Banana banana1 = new Banana();
//    System.out.println(banana1.city);
    Banana ban=(Banana) food;   //向下强转
    System.out.println(ban.city);
    ban.huaPi();


    Tool.food(new Apple());

  }

}
