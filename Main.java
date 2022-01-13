import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    String token = "";
    File fileName = new File("Hail.txt");
    Scanner inputFile = new Scanner(fileName);
    // read and print tokens from Hail.txt file
    int countTokens = 0;
    while(inputFile.hasNext()) {
      token = inputFile.next();
      System.out.print(token + " ");
      countTokens++;
    }
    inputFile.close();
    System.out.println("\nThe number of tokens in \"Hail.txt\" is " + countTokens + "\n");
    // read Hail.txt file and store in String[] array
    Scanner inputFile2 = new Scanner(fileName);
    String[] hail = new String[countTokens];
    int index = 0;
    while(inputFile2.hasNext()) {
      hail[index] = inputFile2.next();
      index++;
    }
    inputFile2.close();
    for(String i: hail) {
      System.out.println(i);
    }
    // read hailCommas.txt file with comma delimiter
    File file3 = new File("hailCommas.txt");
    Scanner inputFile3 = new Scanner(file3).useDelimiter(",");
    while(inputFile3.hasNext()) {
      token = inputFile3.next();
      System.out.println(token);
    }
    inputFile3.close();
  }
}