/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 2:02 下午
 */
public class Outer {

  public  void  show2(){

  }
  public   static  void  show(){

    final Integer age=34;
    class  Inner{
      private   String   username;
      //set/get
      public    void   run(final  Integer  newAge){
        //newAge=58;
        System.out.println("----"+username);
       // show2();

      }


    }
    new  Inner().run(56);

    class   B{
      Inner   in=new  Inner();
          //in.run(67);

      public  void  show3(){

      }

    }

  }
}

