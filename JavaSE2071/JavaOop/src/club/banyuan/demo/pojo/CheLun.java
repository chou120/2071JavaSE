package club.banyuan.demo.pojo;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 2:08 下午
 */
public class CheLun {

  private   String  CheId;
  private   String  texture;
  private   double redio;
  private   double price;
  private   String   CheLunBrand;

  public String getCheId() {
    return CheId;
  }

  public void setCheId(String cheId) {
    CheId = cheId;
  }

  public String getTexture() {
    return texture;
  }

  public void setTexture(String texture) {
    this.texture = texture;
  }

  public double getRedio() {
    return redio;
  }

  public void setRedio(double redio) {
    this.redio = redio;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCheLunBrand() {
    return CheLunBrand;
  }

  public void setCheLunBrand(String cheLunBrand) {
    CheLunBrand = cheLunBrand;
  }

  @Override
  public String toString() {
    return "CheLun{" +
        "CheId='" + CheId + '\'' +
        ", texture='" + texture + '\'' +
        ", redio=" + redio +
        ", price=" + price +
        ", CheLunBrand='" + CheLunBrand + '\'' +
        '}';
  }
}
