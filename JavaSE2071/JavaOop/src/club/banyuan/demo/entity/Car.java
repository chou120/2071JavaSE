package club.banyuan.demo.entity;


import club.banyuan.demo.pojo.*;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 2:58 下午
 */
public class Car {
  /**
   * 汽车特征
   *
   */
  private String CardId;
  private String brand;  //分为国内 国外
  private String type;  //客车  卡车  火车  轿车...
  private String color; //
  private CheLun cheLun;  //  编号  大小  颜色  材质
  private Component engine;
  private double price;

  public String getCardId() {
    return CardId;
  }

  public void setCardId(String cardId) {
    CardId = cardId;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public CheLun getCheLun() {
    return cheLun;
  }

  public void setCheLun(CheLun cheLun) {
    this.cheLun = cheLun;
  }

  public Component getEngine() {
    return engine;
  }

  public void setEngine(Component engine) {
    this.engine = engine;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  @Override
  public String toString() {
    return "Car{" +
        "CardId='" + CardId + '\'' +
        ", brand='" + brand + '\'' +
        ", type='" + type + '\'' +
        ", color='" + color + '\'' +
        ", cheLun材质=" + cheLun.getTexture() +
        ", engine材质=" + engine.getTexture() +
        ", price=" + price +
        '}';
  }
}
