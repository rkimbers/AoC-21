import java.util.Scanner;
import java.io.*;

/*
  Ryan Kimberley
  Advent of Code 12/2/21
  AP Computer Science
 */

public class AdventOfCode2 {

    public static void main(String[] args) throws IOException {

        Scanner scanFile = new Scanner(new File("src/inputDay2.txt"));

        int totalHorizontal = 0;
        int totalDepth = 0;
        int aim = 0;
        String number;
        String word;


        while (scanFile.hasNextLine()) {

            String data = scanFile.nextLine();

            word = data.substring(0, data.lastIndexOf(" "));
            number = data.substring((data.lastIndexOf(" ")) + 1, data.length());


            int move = Integer.parseInt(number);

            if (word.equals("forward")) {
                totalHorizontal += move;
                totalDepth += (aim*move);
            }
            else if (word.equals("down")) {
                //totalDepth += move;
                aim += move;

            }
            else if (word.equals("up")){
                //totalDepth -= move;
                aim -= move;

            }


        }

        System.out.println("Total depth: "+totalDepth);
        System.out.println("Total horizontal movement: "+totalHorizontal);

        System.out.println("Ans= "+totalDepth*totalHorizontal);

        //p1 14 min, 41 seconds
        //p2 9 min 51 seconds
    }
}