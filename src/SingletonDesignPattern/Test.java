package SingletonDesignPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author rbhavsar
 * Created on 7/21/20.
 */
public class Test {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    DateUtil dateUtil1 = DateUtil.getInstace();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/rbhavsar/DesignPatterns/src/SingletonDesignPattern/dateUtil.ser")));
    oos.writeObject(dateUtil1);

    DateUtil dateUtil2 = DateUtil.getInstace();
    ObjectInputStream ooi = new ObjectInputStream(new FileInputStream(new File("/Users/rbhavsar/DesignPatterns/src/SingletonDesignPattern/dateUtil.ser")));
    dateUtil2 = (DateUtil)ooi.readObject();

    DateUtil dateUtil3 = DateUtil.getInstace();

    System.out.println(dateUtil1==dateUtil2); // after deseralized , serialized , if we compare object then it returns false but because of readResolve in DateUtil, it will return true



  }

}
