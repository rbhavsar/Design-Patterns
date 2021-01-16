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

    //Adv - It provides factory of object , if any new class introduce in future then just need to update code in OperatingSystemFactory but it does not change anything client code..
    OperatingSystemFactory opf = new OperatingSystemFactory();
    OS os = opf.getInstace("Open");
    os.spec();

  }
}
