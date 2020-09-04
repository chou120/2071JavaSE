package club.banyuan.demo.pojo;

import java.util.Scanner;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 10:37 上午
 */
public class Component {

  //特性  属性
  private double length=2.5;
  //被private 修饰的变量 只能在本类中直接访问  外面类如果想要访问就必须访问本类提供的非private方法
  double redio=2;
  String color="绿色";
  String texture="钛合金";  //材质必须是在莫某某范围指定范围内
  String componentName="元素周期表51号元素";
  private String [] textureArray={"木头","混凝土","泥巴","沥青","聚录乙烯","碳纤维"};
  //除了能放数组  能不能放 对象

  public  void  choiceTexture(String tt){
    for (int i = 0; i < textureArray.length; i++) {
      if(textureArray[i].equalsIgnoreCase(tt)){
        texture=tt;
      }
    }
  }

  /**
   * 显示成员信息的功能
   */
  public   void  showInfo(){
    System.out.println("长度:"+length+",半径:"+redio+",颜色:"+color+",材质:"+texture+
        ",名称:"+componentName);
  }

  /**
   * 检查赋值是否满足条件
   */
  public  void   check(double leng){  //局部变量 给全局变量赋值
      if(leng>0 && leng<5){
        length=leng;
      }else{
        System.err.println("输入数据违法...");
      }
  }
}

class   Test{
  public static void main(String[] args) {
    // 类名  变量名=new  类名();
    Component component = new Component();  //创建了一个实体对象  根据Component模板创建的
    //System.out.println("半径:"+component.redio+",材质"+component.texture);
    component.showInfo();
    Component planeComponent1 = new Component();
   // component1.showInfo();

    Scanner scan=new  Scanner(System.in);
    double leng=scan.nextDouble();

    //planeComponent1.length=-2;
    planeComponent1.check(leng);  //通过加  private  对属性的限制  必须通过 调用  check才能重新给属性赋值


    planeComponent1.choiceTexture("沥青");



   /*if(leng>0 && leng<5){
     planeComponent1.length=leng;
   }  //存在两个问题   数据安全

    planeComponent1.redio=-3;

    planeComponent1.texture="xxx未知材料";
    planeComponent1.color="银色";
    planeComponent1.componentName="sb";
*/
    planeComponent1.showInfo();






  }
}


