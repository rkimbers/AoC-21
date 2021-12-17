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
        int fuelNumber = 0;
        int currentDigit = 0;
        int nextFuelCount = 0;
        int min = 0;


        String[] numbers = input.split(",");

        while(fuelNumber < 1500){
            fuelCount = 0;
            nextFuelCount = 0;
            for (String k : numbers) {

                currentDigit = Integer.parseInt(k);
                fuelCount += Math.abs(currentDigit - fuelNumber);
                nextFuelCount += Math.abs(currentDigit - (fuelNumber+1));


            }
            fuelNumber += 1;
            if (nextFuelCount < fuelCount){
                min = nextFuelCount;
                count = (fuelNumber+1);
            }

        }
        System.out.println(count); //312
        System.out.println("First ans "+min); //347011


        int min1 = 0;
        int fuelCount1 = 0;
        int nextFuelCount1 = 0;
        int n = 0;
        int n1 = 0;
        int add = 0;
        int add1 = 0;
        fuelNumber = count;

        while(fuelNumber < 1500) {
            fuelCount1 = 0;
            nextFuelCount1 = 0;
            for (String k : numbers) {

                currentDigit = Integer.parseInt(k);
                n = (Math.abs(currentDigit - fuelNumber));
                n1 = (Math.abs(currentDigit - (fuelNumber+1)));

                add = ((n*n)+n)/2;
                add1 = ((n1*n1)+n1)/2;

                fuelCount1 += add;
                nextFuelCount1 += add1;

            }
            fuelNumber += 1;
            if (nextFuelCount1 < fuelCount1){
                min1 = nextFuelCount1;
            }
        }
        System.out.println("Second ans "+min1);







    }
}
