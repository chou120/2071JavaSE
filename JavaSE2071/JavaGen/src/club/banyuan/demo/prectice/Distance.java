package club.banyuan.demo.prectice;

import java.util.Arrays;
import java.util.Comparator;

public class Distance {

  private int meter;

  public Distance(int meter) {
    this.meter = meter;
  }

  public int getMeter() {
    return meter;
  }

  public void setMeter(int meter) {
    this.meter = meter;
  }

  @Override
  public String toString() {
    return "Distance{" +
        "meter=" + meter +
        '}';
  }
}
class TestDistance{

  public static void main(String[] args) {
    Distance[] distances = new Distance[]{
        new Distance(10),
        new Distance(30),
        new Distance(20),
        new Distance(60),
        new Distance(70),
        new Distance(40)
    };
//    Arrays.sort(distances, new Comparator<Distance>() {
//      @Override
//      public int compare(Distance o1, Distance o2) {
//        return  o1.getMeter()-o2.getMeter();
//      }
//    });

    Arrays.sort(distances, (o1,o2)->o1.getMeter() - o2.getMeter() );
    System.out.println(Arrays.toString(distances));


    //学生对象 根据分数高低排名


  }
}
