package club.banyuan.demo;

public class Main {

    public static void main(String[] args) {
            //
            //System.out.println("hello banyuan");
            System.out.println("字符串：" + 15+78); // 字符串：15
            System.out.println("字符串：" + (char)(1+'a')); // 字符串：a
            System.out.println("字符串：" + true); // 字符串：true
            System.out.println("字符串：" + 3.14); // 字符串：3.14

            System.out.println(" "+15);
            System.out.println("15");

            String string="你好";

            int[] ints = new int[6];
            //ints.length=9;
            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
           // System.out.println("--------"+ints[6]);
            int[] ints1 = new int[3];
            ints=ints1;
            ints=null;
            //Exception in thread "main" java.lang.NullPointerException
          //  System.out.println(ints.length);

            float[] floats = new float[3];

            System.out.println(floats[0]+0.0);

            String[] strings = new String[3];
            strings[0]="张三";
            strings[1]="张三1";
            strings[2]="张三2";

            //System.out.println(strings[0]);
    //        for (String   str:strings) {
    //            System.out.println(str);
    //        }

        int [][] arr=new int[2][3];
        System.out.println(arr[0][0]);

    }
}
