package club.banyuan.poly;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 2:14 下午
 */
public class Tool {


//  public static  void  rice(Rice  rice){
//    rice.changeColor();
//  }
//
//  public static  void  apple(Apple  rice){
//    rice.changeColor();
//  }
//
//  public static  void  banana(Banana  rice){
//    rice.changeColor();
//  }


  public static  void  food(Food  food){  //  food 接受本身及其子类对象
    if( food instanceof Banana){
      food.changeColor();
    }

  }





}
