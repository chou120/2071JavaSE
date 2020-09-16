package club.banyuan.enum1;

import club.banyuan.enum1.Food.*;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 10:06 上午
 */
public enum  EnumDemo3 {

  FIRST{  //枚举对象
    @Override
  public String getInfo() {
    return "FIRST TIME";
  }},
  SECOND{
    @Override
    public String getInfo() {
      return "SECOND TIME";
    }
  }
  ;
  /**
   * 定义抽象方法
   * @return
   */
  public abstract String getInfo();


  public static void main(String[] args){
    System.out.println("F:"+EnumDemo3.FIRST.getInfo());
    System.out.println("S:"+EnumDemo3.SECOND.getInfo());

    food food = EnumDemo2.FOOD;
    food.eat();
  }

}


interface food{
  void eat();
}

interface sport{
  void run();
}

 enum EnumDemo2 implements food ,sport{
  FOOD,
  SPORT,
  ; //分号分隔

  @Override
  public void eat() {
    System.out.println("eat.....");
  }

  @Override
  public void run() {
    System.out.println("run.....");
  }
}


interface Food {  //推荐
  enum Appetizer implements Food {

    SALAD("沙拉"), SOUP("汤"), SPRING_ROLLS("春卷");
    private  String  desc;

    Appetizer(String desc) {
      this.desc = desc;
    }

  }
  enum MainCourse implements Food {
    LASAGNE, BURRITO, PAD_THAI,
    LENTILS, HUMMOUS, VINDALOO;
  }
  enum Dessert implements Food {
    TIRAMISU, GELATO, BLACK_FOREST_CAKE,
    FRUIT, CREME_CARAMEL;
  }
  enum Coffee implements Food {
    BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
    LATTE, CAPPUCCINO, TEA, HERB_TEA;
  }
}

 class TypeOfFood {
  public static void main(String[] args) {

    Food food = Food.Appetizer.SALAD;
    food = Food.MainCourse.LASAGNE;
    food = Food.Dessert.GELATO;
    food = Food.Coffee.CAPPUCCINO;
  }
}



//enum Color {GREEN,RED,BLUE}
//
// class EnumDemo4 {
//
//  public static void printName(Color  color){
//    switch (color){
//      case BLUE: //无需使用Color进行引用
//        System.out.println("蓝色");
//        break;
//      case RED:
//        System.out.println("红色");
//        break;
//      case GREEN:
//        System.out.println("绿色");
//        break;
//    }
//  }
//
//  public static void main(String[] args){
//    printName(Color.BLUE);
//    printName(Color.RED);
//    printName(Color.GREEN);
//
//    //蓝色
//    //红色
//    //绿色
//  }
//}

 enum Color {
  RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
  // 成员变量
  private String name;
  private int index;
  // 构造方法
  private Color(String name, int index) {
    this.name = name;
    this.index = index;
  }
  // 普通方法
  public static String getName(int index) {
    for (Color c : Color.values()) {
      if (c.getIndex() == index) {
        return c.name;
      }
    }
    return null;
  }
  // get set 方法
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getIndex() {
    return index;
  }
  public void setIndex(int index) {
    this.index = index;
  }
}

class   TestColor{

  public static void main(String[] args) {
    System.out.println(Color.getName(3));
  }
}