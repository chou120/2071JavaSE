package club.banyuan.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/8 2:04 下午
 */
public class Demo {

  public static void main(String[] args) {

    Date  date=new  Date();
    //System.out.println(date);
//    System.out.println(date.toLocaleString());
//    System.out.println(date.getTime()+"---------"+System.currentTimeMillis());
//    date.setTime(1000);
//    System.out.println(date);

    //System.out.println(date);
    SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("yyyy MM dd HH:mm:ss SSS");
    String format = simpleDateFormat.format(date);
    System.out.println(format);

    String  dateStr="19900102 20:08:08";

    simpleDateFormat=new SimpleDateFormat("yyyyMMdd HH:mm:ss");

    try {
      date=simpleDateFormat.parse(dateStr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(date);

    //
    Calendar instance = Calendar.getInstance();
    //System.out.println(instance.getTime());
    TimeZone timeZone = instance.getTimeZone();
    String displayName = timeZone.getDisplayName(Locale.CHINA);
    System.out.println(displayName);

    //sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null]
    //TimeZone  ZoneId
   // System.out.println(TimeZone.getTimeZone(ZoneId.of("Asia/Tokyo")));

    instance.set(2020-2, -5, 3);
    System.out.println(instance.getTime());

    instance.clear();
    System.out.println(instance.getTime());




  }
}
