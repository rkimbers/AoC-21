import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AdventOfCode3 {

    public static void main(String[]args)throws IOException{

        Scanner scanFile = new Scanner(new File("src/inputDay3.txt"));

        List<Integer> numbers = new ArrayList();
        numbers.add(scanFile.nextInt());
        numbers.sort();

        int gammaRate = 0;
        int epsilonRate = 0;
        int currentDigit;
        String currentLine;

        while(scanFile.hasNextLine()){

            for(int i = 0; i < 12; i++){

                currentLine = scanFile.nextLine();



            }




        }

    }
}
