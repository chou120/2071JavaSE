package club.banyuan.math;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/8 10:09 上午
 */
public class Demo {
  /**
   * Math：
   *
   */

  public static void main(String[] args) {
    Math.max(123, 412);
      //Math.min()
    int random = (int)(Math.random()*11); // [0,1) 随机数
    System.out.println(random);
    Math.abs(-1);
   // System.out.println( Math.floor(-9.9));
    System.out.println( Math.floorDiv(-4,3)); //  -4/3  --->    -1  1
    System.out.println( Math.round(10.1));

  }

}
