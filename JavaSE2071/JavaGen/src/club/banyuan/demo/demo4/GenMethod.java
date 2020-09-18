package club.banyuan.demo.demo4;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 3:37 下午
 */
public class GenMethod {

  //定义一个泛型类，并定义如下两个方法
  static class Test<T> {

//    //以前是这样定义，现在一个方法搞定
//  	public void show(String t){
//	}
//	public void show(Integer t){
//	}
//	//或者
//	public void show(Object obj){
//	}
  public void show(T t) {
    System.out.println(t);
  }

    public void print(T t) {
      System.out.println(t);
    }
  }

  //在main方法代码如下
  public static void main(String[] args) {

    Test<String> d = new Test<String>();
    d.show("java");
    //d.print(34);

    Test<Integer> e = new Test<Integer>();
    e.show(2);
    e.print(new Integer(5));
  }
}
class Test {

  public <T> void show(T t){
    System.out.println(t);
  }


  public <T> void print(T t){
    System.out.println(t);
  }
  public <U,T> void sum(U u,T t){
    System.out.println(u+" version is "+t);
  }

  public static void main(String[] args) {
    Test d = new Test();
    d.show("java");
    d.print(5);
    d.sum("java", new Double(8));
  }

}