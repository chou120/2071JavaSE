package club.banyuan.wrapClass;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/9 1:35 下午
 */
public class Demo {

  /**
   * 包装类  对基本数据类型的数据提供方法操作的类
   *
   * @param args byte  short  char          int       long   float    double   boolean
   *             Byte  Short  Character     Integer   Long    Float   Double    Boolean
   *             <p>
   *             BigInteger BigDecimal
   */
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE); //2147483647

    System.out.println(Integer.compare(12, 12));

    int x = Integer.parseInt("124");
    System.out.println(x);

    //int i = Integer.parseInt("12", 8);    //
    // System.out.println(i);
    Integer integer = Integer.valueOf("12");
    //integer.intValue();
    int i = integer;  //自动拆箱

    //
    Integer integer1 = 1; //自动装箱  基本数据类型 ---->>包装类型叫 装箱  这步操作叫自动装箱
    Integer integer2 = 1;
    System.out.println(integer + integer2);

    Integer integer3 = new Integer(2);
    Integer integer4 = new Integer(2);

    System.out.println(integer1.equals(integer2)); //true
    System.out.println(integer1 == integer2);// false

    //int reverse = Integer.reverse(456);
    //System.out.println(reverse);

    String string = Integer.toBinaryString(12);
    string = Integer.toOctalString(12);
    System.out.println(string);

    System.out.println(Character.isDigit('1'));  //判断字符是否是数字类型

    //int  lon=Integer.MAX_VALUE+1; // 空间被浪费

   // System.out.println(lon);

    BigInteger  bigInteger=new BigInteger("5");
    BigInteger  bigInteger2=new BigInteger("3");

    System.out.println(bigInteger.add(bigInteger2));
    System.out.println(bigInteger.and(bigInteger2));
    System.out.println(bigInteger.mod(bigInteger2));

    System.out.println(1.0-0.9);  //    0.1   ---->  0.09999999999999998
    BigDecimal bigDecimal = new BigDecimal("1.0");
    BigDecimal bigDecimal2 = new BigDecimal("0.9");

    System.out.println(bigDecimal.subtract(bigDecimal2));



  }
}
