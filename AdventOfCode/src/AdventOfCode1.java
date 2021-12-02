import java.util.Scanner;
import java.io.*;


/*
  Ryan Kimberley
  AP Computer Science
 */

public class AdventOfCode1 {

    public static void main(String[] args) throws IOException {
        
        Scanner scanFile = new Scanner(new File("input1.txt"));
        String input = scanFile.nextLine();

        int inputLength, currentDigit, nextDigit, count = 0;

        inputLength = input.length() - 1;


        for (int i = 0; i < inputLength; i++){



            currentDigit = input.indexOf(i);
            nextDigit = input.indexOf(i+1);

            if (nextDigit > currentDigit) count += 1;



        }

        System.out.print("Count: "+count);






    }

}
