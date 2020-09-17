package club.banyuan.prectice;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 9:48 上午
 */
public class Demo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入字符串:");
    String  strNumber=scanner.nextLine();
    while(true){
      Integer   result=Cal(strNumber);
      System.out.println("结果是:"+result);
      strNumber=scanner.nextLine();
    }
  }
  public  static Integer   Cal(String  number)  { //6 + 7
    //首先考虑程序执行问题
    String[] s = number.split(" ");
    switch (s[1]){
      case "+":
        return  Integer.parseInt(s[0])+Integer.parseInt(s[2]);
      case "-":
        return Integer.parseInt(s[0])-Integer.parseInt(s[2]);
      case "*":
        return Integer.parseInt(s[0])*Integer.parseInt(s[2]);
      case "/":
        return  Integer.parseInt(s[0])/Integer.parseInt(s[2]);
      default:
        System.out.println("非法操作符");
        break;
    }
    return  null;
  }

}
