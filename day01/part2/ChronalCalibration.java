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

      // TODO: If current freq is equal to stored freq, print out
    }
    System.out.print("The total is: ");
    System.out.print(total);
  }
}
