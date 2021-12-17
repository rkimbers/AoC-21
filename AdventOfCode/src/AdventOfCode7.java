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

        double count = 0;
        double fuelCount = 0;
        double fuelNumber = 0;
        double currentDigit = 0;
        double nextFuelCount = 0;
        double min = 0;


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
                count = (fuelNumber);
            }

        }
        System.out.println(count); //312
        System.out.println(min); //347011

        double newFuelNumber = count;
        double newFuelCount = 0;
        double n = 0;

        for (String k : numbers) {

            currentDigit = Integer.parseInt(k);
            n = Math.abs(currentDigit - newFuelNumber);
            double first = currentDigit*10 ;
            double second = newFuelNumber*10;
            newFuelCount += Math.abs(first-second);
            //newFuelCount += (n/2)*(n+1);
            //System.out.println(newFuelCount);



        }
        System.out.println(newFuelCount); //195195365 too high //not 3470110





    }
}