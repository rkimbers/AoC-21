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
            if(secondDigit < nextDigit) {
              count += 1;

            }
            secondDigit = nextDigit;


        }

        System.out.println("Count - p1: "+count);

        //------------part 2---------------

        Scanner scanFile2 = new Scanner(new File("src/inputDay1.txt"));

        firstDigit = 0;
        secondDigit = 0;
        nextDigit = 0;
        count = 1;
        int thirdDigit = 0, fourthDigit = 0, sum, nextSum;

        firstDigit = scanFile2.nextInt();
        secondDigit = scanFile2.nextInt();
        thirdDigit = scanFile2.nextInt();
        fourthDigit = scanFile2.nextInt();



        while (scanFile2.hasNextLine()) {


            sum = firstDigit + secondDigit + thirdDigit;

            nextSum = secondDigit + thirdDigit + fourthDigit;

            System.out.println(sum+" "+nextSum);

            nextDigit = scanFile2.nextInt();

            if (nextSum > sum){
                count += 1;

            }
            firstDigit = secondDigit;
            secondDigit = thirdDigit;
            thirdDigit = fourthDigit;
            fourthDigit = nextDigit;



        }


        System.out.println("Count - p2: "+count);

    }


}


