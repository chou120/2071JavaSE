package club.banyuan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 3:50 下午
 */
public class MapDemo {


  public static void main(String[] args) {
    Map<Integer,String>  map=new HashMap<>();
    map.put(9527, "周星星1");
    map.put(9528, "周星星4");
    map.put(9529, "周星星3");
    map.put(9530, "周星星4");
    map.put(9531, "周星星4");
    map.put(9530, "吴孟达");


    map.replace(9527, "我使劲儿么");
    //String remove = map.remove(9530);

    String s = map.get(9527);
    Set<Integer> integers = map.keySet();
    Iterator<Integer> iterator = integers.iterator();
    while (iterator.hasNext()){
      Integer in = iterator.next();  //获取键
      System.out.println("键:"+in+",值:"+map.get(in));
    }

    Collection<String> values = map.values();  //获取所有值
    //Iterator<String> iterator1 = values.iterator();

    boolean zhou = map.containsValue("周星星3");
    map.put(null, "asdsa");   //键值对都可以为空
    System.out.println("----"+map.get(null));

    Hashtable<String, String> objectObjectHashtable = new Hashtable<>();
    objectObjectHashtable.put(null, "assad");  //不可以空
    System.out.println(objectObjectHashtable);
    //ConcurrentHashMap   线程安全
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();//留在线程讲完讲

    /**
    自己尝试写案例:
     *  TreeSet
     *  TreeMap
     *
     */




  }

}
