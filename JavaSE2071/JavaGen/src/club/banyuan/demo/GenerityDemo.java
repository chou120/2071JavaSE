package club.banyuan.demo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 2:55 下午
 */
public class GenerityDemo {

  /**
   * 泛型：
   */

  public static void main(String[] args) {
//    Point point = new Point();
//    point.setObject1(120);
//    point.setObject2("东经90度");
//
//    Object object1 = point.getObject1();
//    Object object2 = point.getObject2();
//
//    Integer integer = (Integer) object1;  //类型强转
//
//    int i = integer + 12;
//    point.setObject1(i);
//
//    //解决 能不能在传递数据的同时 确定类型  也就是说吧数据类型当成参数传递
//
//    System.out.println(point.toString());

    Point<String,Integer>   point=new Point();  //如果不加<数据类型1,数据类型2> 会导致类型被擦除
    point.setK("张三");
    point.setT(45);
    Integer t = point.getT();  //直接把错误的类型给提升到了编译阶段


  }

}


class Point<K, T> {  //占位符   数据类型当成参数传递

  private K k;  //String
  private T t;  //Integer

  @Override
  public String toString() {
    return "Point{" +
        "k=" + k +
        ", t=" + t +
        '}';
  }

  public K getK() {
    return k;
  }

  public void setK(K k) {
    this.k = k;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }
  //  private  Object  object1;
//  private  Object  object2;
//
//  public Object getObject1() {
//    return object1;
//  }
//
//  public void setObject1(Object object1) {
//    this.object1 = object1;
//  }
//
//  public Object getObject2() {
//    return object2;
//  }
//
//  public void setObject2(Object object2) {
//    this.object2 = object2;
//  }
//
//  @Override
//  public String toString() {
//    return "Point{" +
//        "object1=" + object1 +
//        ", object2=" + object2 +
//        '}';
//  }
//  private  Integer north;
//  private  String south;
//
//
//  public Integer getNorth() {
//    return north;
//  }
//
//  public void setNorth(Integer north) {
//    this.north = north;
//  }
//
//  public String getSouth() {
//    return south;
//  }
//
//  public void setSouth(String south) {
//    this.south = south;
//  }
//
//  @Override
//  public String toString() {
//    return "Point{" +
//        "north='" + north + '\'' +
//        ", south='" + south + '\'' +
//        '}';
//  }
}