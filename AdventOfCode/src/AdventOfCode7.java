import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;

/*
  Ryan Kimberley
  Advent of Code 12/4/21
  AP Computer Science
 */


public class AdventOfCode7 {
    public static void main(String[] args) throws IOException {

        Scanner scanFile = new Scanner(new File("src/inputDay7.txt"));

        String input = scanFile.nextLine();

        int count = 0;
        int fuelCount = 0;
        int nextFuelCount = 0;
        int fuelNumber = 0;
        int nextFuelNumber = 1;
        int currentDigit = 0;
        int stringLength = input.length();


        System.out.println(count);

        String[] numbers = input.split(",");

        main : while (nextFuelCount <= fuelCount) {
            for (String k : numbers) {

                currentDigit = Integer.parseInt(k);
                System.out.println(currentDigit);
                fuelCount += Math.abs(currentDigit - fuelNumber);
                nextFuelCount += Math.abs(currentDigit - nextFuelNumber);
                fuelNumber += 1;
                nextFuelNumber += 1;


                }
            if (nextFuelCount < fuelCount){
                break main;


            }

        }
        System.out.println(fuelNumber+" "+nextFuelNumber);
        System.out.println(fuelCount+" "+nextFuelCount);
    }
}