package club.banyuan.function;


/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/15 10:24 上午
 */
public class Demo {

  private class InsideClass implements Incrementable{
    @Override
    public void increment() {
      System.out.println("----");
    }
  }

  public  InsideClass  getInsideClass(){
    return   new InsideClass();
  }

  protected   class  C  extends  A{
    @Override
    public void show() {

    }
  }

  class  D extends B{
    @Override
    public void show2() {

    }
  }

  public  class ImplInterface implements Inner1{
    @Override
    public void add(Object object) {

    }
  }
  public  class ImplInterface2 implements Inner2{

    @Override
    public void add(Object object) {

    }
  }
}





abstract  class A {
  public abstract void  show();
}
abstract  class B {
  public abstract void  show2();
}

interface  Inner1{
  void  add(Object object);
}
interface  Inner2{
  void  add(Object  object);
}


class  TestDemo{

  public static  void main(String[] args) {

    Incrementable  insideClass = new Demo().getInsideClass();
    insideClass.increment();

  }
}


interface Incrementable{
  void increment();
}