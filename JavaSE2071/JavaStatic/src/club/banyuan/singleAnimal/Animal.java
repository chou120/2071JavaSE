package club.banyuan.singleAnimal;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/7 4:21 下午
 */
public class Animal {  //单利模式

  private   static  Animal animal=new Animal();

  private  Animal(){

  }
  static  Animal getInstance(){
    return  animal;
  }

}

class  TestAnimal{

  public static void main(String[] args) {
    Animal instance1 = Animal.getInstance();
    Animal instance2 = Animal.getInstance();
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());

  }
}
