package club.banyuan.eat;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 3:17 下午
 */
public class SiChuan extends Province {

    private  String   kouWei="🌶🌶🌶🌶🌶";

    public  void   kouWei(){
      System.out.println(getName()+"省份,喜欢"+kouWei+"口味....");
    }

  @Override
  public String toString() {
    return  "SiChuan{" +super.toString()+
        "kouWei='" + kouWei + '\'' +
        '}';
  }
}
