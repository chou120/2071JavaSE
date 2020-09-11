package club.banyuan.eat;

import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/10 3:22 下午
 */
public class Tool {

  private static final Province[] PROVINCES = new Province[5];
  private int size;

  public void add(Province province) {
    PROVINCES[size++] = province;
  }
  public  Province[] getProvinces(){
    return PROVINCES;
  }
}

class Test {

  public static void main(String[] args) {
    Tool tool = new Tool();
    Province province = null;

    province = new SiChuan();
    province.setCity("成都");
    province.setName("四川");
    tool.add(province);


    province = new GuangDong();
    province.setName("广东");
    province.setCity("东莞");
    tool.add(province);

    province = new GuangXi();
    province.setCity("桂林");
    province.setName("广西");
    tool.add(province);

    province=new GuangDong();
    province.setName("广东");
    province.setCity("深圳");
    tool.add(province);
    province=new SiChuan();
    province.setCity("自贡");
    province.setName("四川");
    tool.add(province);

    Province[] provinces = tool.getProvinces();
    System.out.println(Arrays.toString(provinces));


  }
}




