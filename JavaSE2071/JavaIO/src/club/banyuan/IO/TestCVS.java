package club.banyuan.IO;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/24 11:03 上午
 */
public class TestCVS {


  public static void main(String[] args) throws IOException {
    File file = new File("JavaIO/java.csv");
    if(!file.exists()){
      file.createNewFile();
    }

    CsvWriter  csvWriter=new CsvWriter(file.getName(), ',', StandardCharsets.UTF_8);
    String [] str={"学生编号","学生姓名","学生班级","学生住址"};
    csvWriter.writeRecord(str);


    String [] str1={"9527","张三","1001","栖霞区"};
    csvWriter.writeRecord(str1);

    String [] str2={"9528","张三","1001","栖霞区"};
    csvWriter.writeRecord(str2);
    csvWriter.close();


    CsvReader  csvReader=new CsvReader(file.getName(), ',', StandardCharsets.UTF_8);
    if(csvReader.readRecord()){  //读取表的每一行数据
      System.out.println(csvReader.getRawRecord());
    }
    if(csvReader.readRecord()){  //读取表的每一行数据
      System.out.println(csvReader.getRawRecord());
    }


  }


}
