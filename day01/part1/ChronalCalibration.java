import java.io.*;
public class ChronalCalibration {
  public static void main(String[] args) throws Exception {
    File file = new File("./puzzleInput.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String str;
    int total = 0;
    while ( (str = br.readLine()) != null ) {
      System.out.println(str);
      total = total + Integer.parseInt(str);
    }
    System.out.print("The total is: ");
    System.out.print(total);
  }
}
