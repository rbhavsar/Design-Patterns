package BuilderDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/19/20.
 */
public class Phone {
  private String os;
  private int ram;
  private String processor;
  private double screenSize;
  private int battery;

  public Phone(String os, int ram, String processor, double screenSize, int battery) {
    this.os = os;
    this.ram = ram;
    this.processor = processor;
    this.screenSize = screenSize;
    this.battery = battery;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Phone{");
    sb.append("os='").append(os).append('\'');
    sb.append(", ram=").append(ram);
    sb.append(", processor='").append(processor).append('\'');
    sb.append(", screenSize=").append(screenSize);
    sb.append(", battery=").append(battery);
    sb.append('}');
    return sb.toString();
  }




}
