package club.banyuan.system;

import java.util.Arrays;
import sun.jvm.hotspot.oops.Array;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/8 11:06 上午
 */
public class Demo {


  public static void main(String[] args) {
//    long start = System.currentTimeMillis();  //1599534467153  从计算机元年开始1970 1.1 8:00     //1599534467153
//    //System.out.println(l);
//    for (int i = 0; i < 1000000; i++) {
//      System.out.println(i);
//    }
//    long end = System.currentTimeMillis();  //1599534467153  从计算机元年开始1970 1.1 8:00     //1599534467153
//
//    System.out.println(end-start);

    int [] arr={3,4,5};
    int [] arr1={31,123,112,1231,11};

    System.arraycopy(arr, 1,arr1 ,2 ,2 );  // 思考:能不能使用这种方式 进行数组扩容

    System.out.println(Arrays.toString(arr1));

    Person person = new Person();
    person.setName("wangwu");

    person=null;

    //System.gc();







  }

}
class  Person {
  private  String name="张三";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("被回收...");
  }
}