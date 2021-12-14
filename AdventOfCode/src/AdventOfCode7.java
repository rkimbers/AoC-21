import java.util.Scanner;
import java.io.*;

/*
  Ryan Kimberley
  Advent of Code 12/4/21
  AP Computer Science
 */


public class AdventOfCode7 {
    public static void main(String[]args)throws IOException{

        Scanner scanFile = new Scanner(new File("src/inputDay7.txt"));

        String input = scanFile.nextLine();

        int count = 0;

        for(int i = 0; i < input.length() - 1; i++){

            count += (int)input.charAt(i);

        }

        System.out.println(count);

        //fuelNumber =


    }
}
