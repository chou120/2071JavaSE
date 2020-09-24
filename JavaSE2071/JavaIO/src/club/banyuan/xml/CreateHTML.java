package club.banyuan.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/24 3:22 下午
 */
public class CreateHTML {

  public static void main(String[] args) {
    //idea对于使用流的方式创建HTML文件可能存在打开文件但是没有实际效果
    String  str="<table style='color:red;border:1px red  solid;'>";
    for (int i = 0; i <3; i++) {
          str=str+"<tr><td>"+"idea对于使用流的方式创建HTML文件可能存在打开文件但是没有实际效果"
              +"</td>" +"<td>"+"我是你大爷"+"</td>"
              + "</tr>";
    }
        str+="</table>";
    //首先要读取一个HTML模板
    String  html="JavaIO/1.html";
    File file1 = new File(html);
    FileInputStream  fileInputStream=null;
    FileOutputStream fileOutputStream=null;
    try {
      fileInputStream=new FileInputStream(file1);  //能读取到模板内容
      int length =(int)file1.length();
      byte [] bytes=new byte[length];
      fileInputStream.read(bytes);
      String s = new String(bytes);

      System.out.println("读取到的内容模板为:"+s);

      String s1 = s.replaceAll("###", str);
      System.out.println(s1);

      //创建一个自己的HTML
      File file = new File("JavaIO/2.html");
      if(!file.exists()){
        file.createNewFile();
      }
      fileOutputStream= new FileOutputStream(file);
      fileOutputStream.write(s1.getBytes());

    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(fileOutputStream!=null){
          fileOutputStream.close();
        }
        if(fileInputStream!=null) {
          fileInputStream.close();
        }
        } catch (IOException e) {
          e.printStackTrace();
        }

    }


  }
}
