import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
  Ryan Kimberley
  Advent of Code 12/2/21
  AP Computer Science
 */

public class AdventOfCode3 {

    public static void main(String[]args)throws IOException{

        Scanner scanFile = new Scanner(new File("src/inputDay3.txt"));

        List<String> numbers = new ArrayList();

        //numbers.sort();

        int gammaRate = 0;
        int epsilonRate = 0;
        int leastCommon = 0;
        int mostCommon = 0;
        int sum = 0;

        int currentDigit;
        String currentLine;

        while(scanFile.hasNextLine()){

            numbers.add(scanFile.nextLine());
            }
        //numbers.forEach((n) -> System.out.println(n));

        StringBuilder binary = new StringBuilder();
        StringBuilder binary1 = new StringBuilder();
System.out.println(numbers.size());
        for(int i = 0; i<12;i++){
            int counter0 = 0;
            int counter1 = 0;
            for(String num:numbers){
                currentDigit = Integer.parseInt(num.substring(i,(i+1)));

//                System.out.println(currentDigit+ " " + i);
                if (currentDigit == 1){
                    counter1 += 1;
                }
                else{
                    counter0 += 1;
                }

            }
            if(counter1 > 500){
                gammaRate = 1;
                epsilonRate = 0;
            }
            else{
                gammaRate = 0;
                epsilonRate = 1;
            }
            binary.append(gammaRate);
            binary1.append(epsilonRate);
        }
//        System.out.println(binary);
//        System.out.println(binary1);

        int decimalNumber = Integer.parseInt(binary.toString(),2);
        int decimalNumber1 = Integer.parseInt(binary1.toString(),2);
        System.out.println(decimalNumber*decimalNumber1);


    }

}

