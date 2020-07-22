package FactoryDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/19/20.
 */

/*
   This class is factory of different object based on passed value in getInstace(). That is why it called factory design pattern
 */


public class OperatingSystemFactory {
  public OS getInstace(String str){
    if(str.equalsIgnoreCase("Open")){
      return new Android();
    }else if(str.equalsIgnoreCase("Closed")){
      return new IOS();
    }else{
      return new Windows();
    }
  }
}
