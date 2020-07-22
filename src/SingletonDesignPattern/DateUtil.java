package SingletonDesignPattern;

import java.io.Serializable;

/**
 * @author rbhavsar
 * Created on 7/21/20.
 */

//Problem with sington class + Serializable
public class DateUtil implements Serializable {

  private static final long serialVersionUID = 1L;
  private static volatile DateUtil instace; // recommended to mark it as volatile to avoid issues in multithreaded environment

  private DateUtil(){

  }

  //mark method sync to solve the instace creation when multiple thread access this method... Assume two threads access this method at same time then it will create two instace
  public static DateUtil getInstace(){ // This is lazy intialization
    if (instace == null) {
    synchronized (DateUtil.class) { // make it thread safe
        System.out.println("instace is null");
        instace = new DateUtil();
      }
    }
    return instace;
  }

  //To solve serializion and deseriazation issue, need to implement below method
  public Object readResolve(){
    return instace;
  }


  /*For eagar intialization follow below code
    mostly lazy initialization is preferable
   */



//  private static DateUtil instace;
//
//  static{
//    instace = new DateUtil();
//  }
//
//  private DateUtil(){
//
//  }
//
//  public static DateUtil getInstace(){
//    return instace;
//  }

}
