package AdapterDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/21/20.
 */
public class WeatherAdapter {

  // You can consider adapter is interface between WeatherUI and WeatherFinder
  public int findTemprature(int zipCode){
    String city = "Union City";
    if(zipCode==19406){
      city = "King";
    }
    WeatherFinder finder = new WeatherFinderImpl();
    int temp = finder.find(city);
    return temp;
  }
}
