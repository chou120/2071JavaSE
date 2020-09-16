package club.banyuan.exception2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/16 3:04 下午
 */
public class MyException  extends  RuntimeException{

  public MyException() {
    super();
  }

  public MyException(String message) {
    super(message);
  }

  public MyException(String message, Throwable cause) {
    super(message, cause);
  }

  public MyException(Throwable cause) {
    super(cause);
  }

  protected MyException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
