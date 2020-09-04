package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/3 10:44 上午
 */
public class Hello {  //类名跟源文件名一模一样

  /**
   * 重载   overload   方法名字一样  但是参数列表不一样   跟返回值没关系
   *
   */
  public  static  void   method(){

  }
  public   static  void  method(int a){

  }
  public   static  void  method(char x,double d){

  }
  public   static  double  method(double x,char d){
  //  Math
    return  0.0;
  }

  /**
   * javac club/banyuan/demo/Main.java  先编译
   *  java club.banyuan.demo.Main  再执行
   * @param args
   */





  public static void main(String[] args) {
//    System.out.println("------");
//    //int  好帅=2;
//    // int 2a; // 编译报错
//
//    char  x='汗';  // 2字节
//
//    //idea  整数 int       byte  short  char
//
//    byte b=34;
//    char  ch='a';
//    System.out.println(ch+3.4);  //请问b是什么类型
//
//    float  f=12.7f;
//    double  d=123.4;
//
//    //f=d; //内存溢出
//
//    //System.out.println(0x1FFFFFFFFL);
//
//    //System.out.println();
//    //System.out.print("\n");
//
//   // System.out.println('\u0001\u1231');
//
//
//    char  c;  //在方法里面  变量一定要先赋值在使用   变量在栈内存中
//    // 思考 为什么提出方法在执行完毕之后方法内部的变量所占用空间全部被释放
//    // int   room=c+2;
//   // System.out.println(c);
//
//    final   int ko=129; //常量  被final定义的变量是常量   面向对象具体细讲
//    //ko=45;
//
//    /**
//     *
//     * byte  b=129;
//     * 求输出结果
//     *
//     * byte   x=1;
//     * byte   y=x+2;
//     * 求结果
//     *
//     *  short  a=2;
//     *  short  b=a++;
//     *  short  c=++b+a;
//     *  求结果
//     */
//
//    short  num=1;
//    //num+=1;  num++
//    short  num2=3;
//   //short num3= 8+6;
//    System.out.println(num);
//
//   // System.out.println(1.0-0.89); //0.10999999999999999
//
//    double  dou=29.99;
//    //int   in=(int)dou;
//
//   // System.out.println(-29%-5);
//
//    int  numX=1;
//    numX=numX++;
//    //求numX结果
//   //左=右++
//
//   // int   u= 5>4 ? x<y ? 6 : 7 : 8;
//
//    /**
//     * 用三种方式求  a  和  b 互换值
//     * 1.找临时变量
//     * 2.+ -
//     * 3.^
//     */
//
//    int   number1=-2;  //     0000 0010
//    int   number2=4;  //      0000 0100
//                      //      0000 0110
//                      //      0000 0100
//                      //      0000 0010
//    number1=number1^number2;// 0000 0110
//    number2=number1^number2;// 0000 0010
//    number1=number1^number2; //0000 0100
//
//    // int   ui=2;//思考:如何让ui最少的 最快的步骤变成16
//    System.out.println("---1--"+number1+">>>>"+number2);
//
    int number=2;
//    if(++number==4){
//      System.out.println("---"+number);
//    }else if(number++ < 7){
//      System.out.println("---"+number);
//    }else{
//      System.out.println("---"+number);
//    }
//    System.out.println("---"+number);

    /*switch (3){//整形  字符串  枚举

      case 3:
        System.out.println("hahh");
        continue;
      case  4:
        break;
    }
*/
//    if(true){
//      continue;
//    }

      int   x=0;
      while(x<9){
        System.out.println("x="+x);
        x++;
      }
    System.out.println(x);

    int i = 0;

    for (; i < 20; i++) {
      System.out.println("i"+i);
    }
   // System.out.println(i);
    int t=8+i;



  }
/*
  static  void  method(){
    int x=0;

    System.out.println(x+1);
  }

  */

}
