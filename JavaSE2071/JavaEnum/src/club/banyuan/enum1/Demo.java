package club.banyuan.enum1;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 9:28 上午
 */
public class Demo {

  /**
   * 什么是枚举？
   *
   *
   *
   */
    public static final int MONDAY =1;  //星期一
    public static final int TUESDAY=2;
    public static final int WEDNESDAY=3;
    public static final int THURSDAY=4;
    public static final int FRIDAY=5;
    public static final int SATURDAY=6;
    public static final int SUNDAY=7;

  public static void main(String[] args) {
    //直接引用
    Day day =Day.FRIDAY;

    Consumer<Day> dayConsumer=System.out::println;
    dayConsumer.accept(day);

    System.out.println(day.name());
    System.out.println(day.ordinal()); //获取枚举对象的下标
   // System.out.println();
    Day friday = Day.valueOf("FRIDAY");
    System.out.println(friday);

    Day[] values = Day.values();
    for (Day  value:values) {
      System.out.println("-----"+value);
    }

  }
}

enum   Day{

  MONDAY("星期一"),
  TUESDAY("星期二"),
  WEDNESDAY("星期三"),
  THURSDAY("星期四"),
  FRIDAY("星期五"),
  SATURDAY("星期六"),
  SUNDAY("星期日");//记住要用分号结束

  private String  string;

  private Day(String  string){
    this.string=string;
  }

//  public String getString() {
//    return string;
//  }

  @Override
  public String toString() {
    return "Day{" +
        "string='" + string + '\'' +
        '}';
  }

//  public void setString(String string) {
//    this.string = string;
//  }

  public static void main(String[] args) {
    Day monday = Day.MONDAY;
    System.out.println(monday.toString());
//    monday.setString("星期八");
//    System.out.println(monday.getString());

      Day monday1 = Day.valueOf("MONDAY");
      System.out.println(monday1.name());





  }
}



