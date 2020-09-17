package club.banyuan.demo.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/17 3:28 下午
 */
public class Generitor<T>  implements  Generator<T>{


  @Override
  public T next() {
    return null;
  }
}
interface Generator<T> {
   T next();
}






interface   UserDao<T>{  //Person  Student   Worker

  //数据的CURD
 void  add(T  t);

 int  delete(T  t);

 T  update (T  t);

 T  getByName(String  name);


}

class UserDaoImpl<T> implements  UserDao<T>{

  List<T>  list=new ArrayList<>();

  @Override
  public void add(T t) {

  }

  @Override
  public int delete(T t) {
    return 0;
  }

  @Override
  public T update(T t) {
    return null;
  }

  @Override
  public T getByName(String name) {
    return null;
  }
}




class  Work{
  private  int  index;

}

class  Teacher {
  private  String name;
}