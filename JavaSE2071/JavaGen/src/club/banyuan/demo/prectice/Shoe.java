package club.banyuan.demo.prectice;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 4:14 下午
 */
public class Shoe {

  private  String color;
  private  int  level=1;

  private Person  person;

  public Shoe() {
  }

  public Shoe(String color, int level, Person person) {
    this.color = color;
    this.level = level;
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  @Override
  public String toString() {
    return "Shoe{" +
        "color='" + color + '\'' +
        '}';
  }
}
