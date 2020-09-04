package club.banyuan.demo.entity;

import club.banyuan.demo.pojo.CheLun;
import club.banyuan.demo.pojo.Component;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 3:09 下午
 */
public class TestCar {


  public static void main(String[] args) {
    CheLun cheLun = new CheLun();
    cheLun.setCheId("1001");
    cheLun.setPrice(67);
    cheLun.setCheLunBrand("米其林轮胎");
    cheLun.setRedio(6.7);
    cheLun.setTexture("橡胶");
    Component component = new Component();
    component.checkLength(4);
    component.choiceTexture("水泥");
    component.SetColor("灰色");


    Car car = new Car();
    car.setBrand("大奔");
    car.setCardId("9527");
    car.setPrice(56.8);
    car.setType("敞篷S级迈巴赫");
    car.setCheLun(cheLun);
    car.setEngine(component);
    car.setColor("灰褐色");

    System.out.println(car.toString());

  }

  /**
   * 需求: 现在有一个公司 属性自定义
   *      人
   *      产品
   *      部门
   *  公司成立 boss 让 HR 招人   招生部3     研发部3个人   教学部3个人   后勤部1个
   *
   *  增加难度:每个人都有上司
   *
   *      完成:对 人和部门 所在的对象 增删改查
   *
   *
   *
   */



}
