import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class ChronalCalibration {
  public static void main(String[] args) throws Exception {
    File file = new File("./puzzleInput.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String str;
    int total = 0;

    // Create blank hashmap
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    // Read through each line
    while ( (str = br.readLine()) != null ) {
      total = total + Integer.parseInt(str);
      
      if (hmap.containsKey(total)) {
        hmap.put(total, hmap.get(total) + 1);
        if (hmap.get(total) == 2) {
          System.out.println("Reocurring Frequency: " + Integer.toString(total));
          break;
        } 
      } else {
        hmap.put(total, 1);
      }
    }
    br.close();
  }
}
