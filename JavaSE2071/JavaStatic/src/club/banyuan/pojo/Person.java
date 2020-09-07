package club.banyuan.pojo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/7 4:18 下午
 */
public class Person {


      private   Person(){

      }
      public  static   Person  getInstance(){

        return  new Person();
      }


}

class   TestPerson{

  public static void main(String[] args) {
    Person instance = Person.getInstance();
  }
}