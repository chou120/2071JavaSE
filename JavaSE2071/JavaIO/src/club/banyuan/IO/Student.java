package club.banyuan.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/24 10:36 上午
 */
public class Student {

  private String stuId;
  private String stuName;
  private String classes;
  private String Address;

  public Student() {
  }

  public Student(String stuId, String stuName, String classes, String address) {
    this.stuId = stuId;
    this.stuName = stuName;
    this.classes = classes;
    Address = address;
  }

  public String getStuId() {
    return stuId;
  }

  public void setStuId(String stuId) {
    this.stuId = stuId;
  }

  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public String getClasses() {
    return classes;
  }

  public void setClasses(String classes) {
    this.classes = classes;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  @Override
  public String toString() {
    return "Student{" +
        "stuId='" + stuId + '\'' +
        ", stuName='" + stuName + '\'' +
        ", classes='" + classes + '\'' +
        ", Address='" + Address + '\'' +
        '}';
  }
}

class TestStudent {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("9527", "王五", "1001", "栖霞区"));
    list.add(new Student("9528", "赵六", "1002", "栖霞区"));
    list.add(new Student("9529", "田七", "1003", "栖霞区"));
    list.add(new Student("9530", "杨八", "1004", "栖霞区"));

    File file = new File("JavaIO/1.txt");
    OutputStream  outputStream=null;
    try {
      if (!file.exists()) {
        file.createNewFile();
      }
      outputStream= new FileOutputStream(file, true);
      for (Student  student:list) {
        outputStream.write(student.toString().getBytes());
        outputStream.write("\n".getBytes());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      if(outputStream!=null){
        try {
          outputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}