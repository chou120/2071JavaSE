package club.banyuan.string;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/8 3:05 下午
 */
public class Demo {

  /**
   * String 定义的字符串不能被改变
   *
   * @param args
   */

  public static void main(String[] args) {
    String s = "12345678";
    //s="asashahiasih";

    String s1 = new String("张三");
//    s1 = new String(new char[]{'1', 'a', 'b', 98});
//    System.out.println(s1);
//    s1=new String(new byte[]{97,98,99,100}); 常用
//    System.out.println(s1);

    String str = "张三丰";
    s1 = new String(str.getBytes(), StandardCharsets.ISO_8859_1); //常用
    byte[] bytes = s1.getBytes(Charset.forName("ISO_8859_1"));
    System.out.println(new String(bytes, StandardCharsets.UTF_8));

    str = new String(new char[]{'1', 'a', 'b', 98}, 0, 3); //常用

    //System.out.println(str);

    String s2 = String.copyValueOf(new char[]{'1', 'a', 'b', 98});
    System.out.println(s2);
    //String.valueOf(3) 常用

    String st = "肉装张大仙";
    // String  st1=new  String("肉装张大仙"); //  String st1=st;
    String st2 = "王五" + "肉装张大仙";
    String st3 = "王五肉装张大仙";

    System.out.println(st3.equals(st2)); //true
    System.out.println(st3 == st2); // false

    // String  st4="你"+"我"+"他"+"哈哈";

//
//    // 去首位空格
    System.out.println("  123  1234  ".trim());
//    // 是否包含指定的字符串
    System.out.println("12345678".contains("234"));
    //   s.replace("1", "3");
//    // 替换字符串
//    System.out.println("12345678".replace("123", "a"));
//    System.out.println("12345123".replace("123", "a"));
//    System.out.println("12345123".replaceFirst("123", "a"));
//    System.out.println("12345123".replaceAll("123", "a"));

//    System.out.println("1234567890".startsWith("123")); //endWith()
//    System.out.println("11234567890".startsWith("123", 1));
//
//    // 字符串切割
//    String[] split = "1990.01.05".split("\\.");
//    System.out.println(split[0]);
//    System.out.println(split[1]);
//    System.out.println(split[2]);

    // System.out.println(Arrays.toString("1990--01-05".split("-")));
//
//    // 拆分字符串
//    System.out.println("012345678".substring(2));
//    // 从下表第二个位置截取直到下标为5停止，不包含5，[2,5)
//    System.out.println("012345678".substring(2, 5));

    String subStr = "123456;";
    System.out.println(subStr.substring(0, subStr.length() - 1));

    char[] chars = "abcde".toCharArray();
    System.out.println(Arrays.toString(chars));

//    System.out.println(new String(chars));
//
//    System.out.println("abcde" == new String("abcde".toCharArray()));
//    System.out.println("abcde" == new String("abcde"));
//    System.out.println("abcde" == "abcde");
    String src = "c";
//    System.out.println("abcde" == "ab" + src + "de");
//    System.out.println("abcde" == "abc" + "de");
//
    System.out.println("abcde".equals("ab" + src + "de"));
//
    System.out.println("ABC".equalsIgnoreCase("abc"));
    System.out.println("ABC".equals("abc"));
//
//    s.toLowerCase();
//    s.toUpperCase();
//
    System.out.println("a123456a".indexOf('a'));
    System.out.println("a123456a".lastIndexOf('a'));
    System.out.println("a123456a".lastIndexOf("1234"));
//    // 找不到返回-1
    System.out.println("a123456a".lastIndexOf("abcd"));

    System.out.println("hahsaA".compareTo("hahsah"));

    char c = "你好".charAt(1);
    System.out.println(c);


  }
}
