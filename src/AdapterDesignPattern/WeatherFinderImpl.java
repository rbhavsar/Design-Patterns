package AdapterDesignPattern;

/**
 * @author rbhavsar
 * Created on 7/21/20.
 */
public class WeatherFinderImpl implements WeatherFinder {

  public int find(String city){
    if(city.equalsIgnoreCase("Union city")){
      return 100;
    }else {
      return 200;
    }
  }
}
