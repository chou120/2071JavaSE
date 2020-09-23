package club.banyuan.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/23 3:39 下午
 */
public class Demo {

  /**
   * File  类
   */
  public static void main(String[] args) {
    File  file=new File("JavaIO/src/club/banyuan"); //    /Users/sanye/2071/2071JavaSE/JavaSE2071

//    System.out.println(file.exists());
//    System.out.println(file.getPath());
//    System.out.println(file.getAbsolutePath());
//
//    System.out.println(file.getName()+"--"+file.length());  //一个汉字三个字节
//
//   // System.out.println(file.delete());
//
//    if(!file.exists()){
//      try {
//        System.out.println(file.createNewFile());
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
//    System.out.println(file.getParent());
//
//   // System.out.println(file.renameTo(new File("JavaIO/张三.md")));
//
//    System.out.println(file.isDirectory()+"--"+file.isFile());
//
//    System.out.println(file.setReadOnly());
//
//    System.out.println(file.canWrite());

//   file =new File("JavaIO/src/banyuan/zhangsan/lisi/wnagwu");
//   System.out.println(file.mkdirs());

//    String[] list = file.list();
//    File[] files = file.listFiles();
//    for (File  str:files) {
//      System.out.println("--"+str);
//    }

    File[] files = file.listFiles(new FilenameFilter() {//文件过滤器
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith(".jpg")) {
          return true;
        }
        return false;
      }
    });
    for (  File  fi: files) {
      System.out.println(">>>>>>>"+fi.getName());
    }

    //练习: 自己尝试  使用另一个文件过滤器  file.listFiles()
    // 找到指定文件夹下面所有的以jpg为结尾的文件 并且子文件夹下面如果也有相应的图片也要找出来

  }
}
