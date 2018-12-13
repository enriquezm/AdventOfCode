import java.io.*;
public class ChronalCalibration {
  public static void main(String[] args) throws Exception {
    File file = new File("/Users/mylesenriquez/Development/java/advent_cal_1/puzzleInput.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String str;
    int total = 0;
    int storedFrequency = 0;

    while ( (str = br.readLine()) != null ) {
      System.out.println(str);
      total = total + Integer.parseInt(str);

      // TODO: Consider using a hashmap data structure
      // for every entry, check its key if value is > 1, return that key as the first freq occurance.
    }
    System.out.print("The total is: ");
    System.out.print(total);
  }
}
