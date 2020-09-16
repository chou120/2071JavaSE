package club.banyuan.exception2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 2:40 下午
 */
public class Demo {

  /**
   * throws 把异常抛给虚拟机去处理
   *
   * @param args
   * @throws ParseException
   */

  public static void main(String[] args) {

    //
//        try{   //是由开发者决定的
//
//        }catch (){
//
//        }finally{
//
//        }
//
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String format = simpleDateFormat.format(date);
    System.out.println(format);

    String str = "2020-09-16";
    simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date parse = null;

    try {
      parse = get(str);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(parse);
    try {
      checkNumber("567128312789721971");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Date get(String dateStr) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date parse = null;
    parse = simpleDateFormat.parse(dateStr);//编译时异常   ParseException  IOException
    return parse;
  }

  public static void checkNumber(String number) throws Exception { //number是一个数字字符串
    // 比较字符串的每个字符是否合法  以下代码需要修改
    if (number.equals(" ") || number == null || number.contains("@")) {
      //能不能抛出一个一个异常  把他交给本方法去处理 (如果本方法内部处理不了的时候会交给调用者)
      throw new MyException("输入的字符串不合法!!!");  //抛出一个自定义异常对象  等待调用者解决异常
    }
    if (number.length() > 10 || number.length() < 1) {
      throw new MyException("InputStringNotLegal,please ReInput");
    }
    char[] chars = number.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (Character.isDigit(chars[i])) {
        System.out.println("has哈哈哈撒");
      } else {
        throw new MyException("输入的字符串中包含了非数字字符");  //  a  b  * & @
      }
    }
  }
}
