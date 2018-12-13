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
    int storedFrequency = 0;

    // Create blank hashmap
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    // Read through each line
    while ( (str = br.readLine()) != null ) {
      // for each token in file, search to see if hash map contains key
      if (hmap.containsKey(Integer.parseInt(str))) {
        System.out.println("Contains " + Integer.toString(intToSearchFor));
      }
      // if contains key, check key's value
        // if value is 2, return key
      // else add kay to hashmap
    }
    
    
    System.out.println("Before:" + hmap);
    hmap.put(1, 0);
    System.out.println("After:" + hmap);
    int intToSearchFor = 1;
    if (hmap.containsKey(intToSearchFor)) {
      System.out.println("Contains " + Integer.toString(intToSearchFor));
    }

  }
}
