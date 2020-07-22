package AdapterDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/21/20.
 */
public class WeatherUI {

  public static void showTemprature(int zipCode){
    WeatherAdapter adapter = new WeatherAdapter();
    System.out.println(adapter.findTemprature(zipCode));
  }

  public static void main(String[] args) {
    showTemprature(194787);
  }
}
