import java.util.Scanner;
import java.io.*;


/*
  Ryan Kimberley
  Advent of Code 12/1/21
  AP Computer Science
 */

public class AdventOfCode1 {

    public static void main(String[] args) throws IOException {

        Scanner scanFile = new Scanner(new File("src/inputDay1.txt"));

        int firstDigit = 0, secondDigit = 0, count = 0;
        boolean readTwoLines = false;

        while (scanFile.hasNextLine()) {

            firstDigit = scanFile.nextInt();
            while (!readTwoLines && scanFile.hasNextLine()) {
                secondDigit = scanFile.nextInt();
                readTwoLines = true;
            }

           System.out.println(" "+firstDigit+" "+secondDigit);

            if(firstDigit < secondDigit) count += 1;


        }

        System.out.println("Count: "+count);


    }

}
