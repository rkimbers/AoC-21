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

        int firstDigit = 0, secondDigit = 0, nextDigit = 0, count = 1;
        boolean readTwoLines = false;

        firstDigit = scanFile.nextInt();
        secondDigit = scanFile.nextInt();


        while (scanFile.hasNextLine()) {


            while (!readTwoLines && scanFile.hasNextLine()) {
                secondDigit = scanFile.nextInt();
                readTwoLines = true;
            }

            nextDigit = scanFile.nextInt();

           System.out.println(secondDigit+" "+nextDigit);
            if(secondDigit < nextDigit) {
              count += 1;

            }
            secondDigit = nextDigit;


        }

        System.out.println("Count: "+count);



    }

}
