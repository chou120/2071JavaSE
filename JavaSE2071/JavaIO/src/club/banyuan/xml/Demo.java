package club.banyuan.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/24 11:22 上午
 */
public class Demo {

  /**
   * 第一步：创建一个SAXReader解析器
   * `SAXReader reader = new SAXReader();`
   *  第二步：解析xml文件，重新构建成一个Document对象
   * `Document doc = reader.read(file);`
   * 第三步：处理Document对象信息，在控制台打印
   * @param args
   */

  public static void main(String[] args) {
      //如何对xml进行解析
    SAXReader reader = new SAXReader();  //需要特定的解析器对xml文件进行解析
    File file = new File("JavaIO/teach.xml");
    try {
      Document read = reader.read(file);  //得到文档对象
      Element rootElement = read.getRootElement();
      System.out.println(rootElement.getName()); //Students
      List student = rootElement.elements("student");
      for (Object  o:student) {
        Element  element=(Element) o;
        System.out.println(element.getName()+":"+element.attribute("id").getValue());
      }
      //Iterator iterator = rootElement.elementIterator("teacher");
//      while(iterator.hasNext()){
//        Node next =(Node) iterator.next();
//        System.out.println(next.getName()+">>>");
//      }
//      Element student = rootElement.element("teacher");
//      System.out.println(student.getName());
      //Node node = rootElement.node(2);
      //System.out.println(">>>>"+node.getName());
      //sIterator iterator = rootElement.elementIterator();

//      while(iterator.hasNext()){
//        Element next =(Element) iterator.next();
//        //System.out.println(">>>>>"+next.getName());
//        Iterator iterator1 = next.elementIterator();
//        while(iterator1.hasNext()){
//          Element  element=(Element) iterator1.next();
//          System.out.println(element.getName()+"内容是:"+element.getText());
//        }
//      }
    } catch (DocumentException e) {
      e.printStackTrace();
    }

    /**
     * 任务一:读取teach.xml所有的数据并且添加到相应的对象中,在控制台打印
     * 任务二:将集合中对象写入xml文件
     * 任务三:将xml文件中数据读取,写到HTML页面中(以表格的方式写入)
     */
  }
}
