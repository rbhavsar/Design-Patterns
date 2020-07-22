package FactoryDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/19/20.
 */
public class FactoryMain {

  public static void main(String[] args) {
//    OS obj = new Android();
//    obj.spec();
    //Instead of above we can use factory

    OperatingSystemFactory opf = new OperatingSystemFactory();
    OS os = opf.getInstace("Open");
    os.spec();

  }
}
