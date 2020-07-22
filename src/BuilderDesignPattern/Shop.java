package BuilderDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/19/20.
 */
public class Shop {
  public static void main(String[] args) {
    // need to pass correct params to get Phone object.. sometime become complex... my req - don't want to pass ram and other params.. for this builder pattern useful
    Phone p = new Phone("Android",2,"QualComm",5.5,3100);
    System.out.println(p); //Phone{os='Android', ram=2, processor='QualComm', screenSize=5.5, battery=3100}

    Phone p1 = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
    System.out.println(p1); //Phone{os='Android', ram=2, processor='null', screenSize=0.0, battery=0}
  }
}
