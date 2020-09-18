package club.banyuan.demo.prectice;

import java.util.Arrays;
/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 4:09 下午
 */
public  class Demo<T,V>  implements  CheckTrueOrFalse<T>{
  //使用泛型类
  private  T  t;  //传递一个鞋子
  private  V  v;  //一个人鉴定鞋子真假
  private  int  size=0;
  private Object[] objects;

  public Demo() {
    objects=new Object[0];
  }

  public Demo(T t, V v) {
    this.t = t;
    this.v = v;
  }

  public T getT() {
    return t;
  }
  public void setT(T t) {
    this.t = t;
  }

  public V getV() {
    return v;
  }

  public void setV(V v) {
    this.v = v;
  }

  @Override
  public  boolean add(T t) {
    objects= Arrays.copyOf(objects, objects.length+1);
    objects[size++]=t;
    return true;
  }
}

class Demo2{

  public  boolean add(Shoe t) {

    return false;
  }
}



class  TestShoe{

  public static void main(String[] args) {
    SportShoe sportShoe = new SportShoe();
    sportShoe.setColor("yellow");
    sportShoe.setLevel(4);

    Person person = new Person();
    person.setName("莆田");
    sportShoe.setPerson(person);


    Demo<Shoe,Person> demo=new Demo<>();
    demo.setT(sportShoe);
    demo.setV(person);
    boolean add = demo.add(sportShoe);
    System.out.println(add+"---"+demo.getT().toString());


  }
}
