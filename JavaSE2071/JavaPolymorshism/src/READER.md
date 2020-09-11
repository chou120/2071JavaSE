```java

public class Person{
  public void show(){
    method(); 
}
    public void method(){
      System.out.println("张三丰");
    }
}
class Son extend Person{
    public void show(){
        super.method(); 
    }
    public void method(){
      System.out.println("贾克斯");
    }
}
class GrandSon extend Son{
    public void method(){
      System.out.println("加特林");
    }
}
class  Test{

  public static void main(String[] args){
    Person person=new GrandSon();
    person.show();

}
}
  



```