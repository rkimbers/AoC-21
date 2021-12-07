import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
  Ryan Kimberley
  Advent of Code 12/3/21
  AP Computer Science
 */

public class AdventOfCode3 {

    public static void main(String[]args)throws IOException{

        Scanner scanFile = new Scanner(new File("src/inputDay3.txt"));

        List<String> numbers = new ArrayList();

        List<String> generator = new ArrayList();
        List<String> scrubber = new ArrayList();

        int gammaRate = 0;
        int epsilonRate = 0;
        int currentDigit;
        String oxygenGen = "";
        String c02 = "";


        while(scanFile.hasNextLine()){

            String line = scanFile.nextLine();
            generator.add(line);
            scrubber.add(line);
            numbers.add(line);

            }
        //numbers.forEach((n) -> System.out.println(n));



        StringBuilder binary = new StringBuilder();
        StringBuilder binary1 = new StringBuilder();

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
            if(counter1 > counter0){
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


        //---p2


        int common = 0;


        outer:for(int i = 0; i<12;i++){
            int counter0 = 0;
            int counter1 = 0;
            boolean equalCounts = false;
            int commonOxy = 0;
            int commonC02 = 1;
            System.out.println("********************************");
            ListIterator<String> iter = generator.listIterator();
            while(iter.hasNext()) {
                String num = iter.next();

                System.out.println(num);
                currentDigit = Integer.parseInt(num.substring(i,(i+1)));

//                System.out.println(currentDigit+ " " + i);
                if (currentDigit == 1){
                    counter1 += 1;
                }
                else{
                    counter0 += 1;
                }

            }
            if(counter1 > counter0){
                common = 1;

            } else {
                common = 0;
            }
            if(counter1 == counter0){
                System.out.println("Equal");
                equalCounts = true;
                common = 1;
            }
            System.out.println("Counter 0 " + counter0);
System.out.println("Counter 1 " + counter1);
            ListIterator<String> iter3 = generator.listIterator();
            while(iter3.hasNext()) {

                String o = iter3.next();
                currentDigit = Integer.parseInt(o.substring(i, (i + 1)));

                if (currentDigit != common) {
//                    if (currentDigit != common || (equalCounts && currentDigit == 0)) {
//                    System.out.println("Common " + common + " CommonOxy " + commonOxy);
                    iter3.remove();
                    if (generator.size() == 1) {
                        oxygenGen = generator.get(0);
break outer;
                    }
                }
            }

            }

        outer:for(int i = 0; i<12;i++){
            int counter0 = 0;
            int counter1 = 0;
            boolean equalCounts = false;
            int commonOxy = 0;
            int commonC02 = 1;
            ListIterator<String> iter = scrubber.listIterator();
            while(iter.hasNext()) {
                String num = iter.next();
                currentDigit = Integer.parseInt(num.substring(i,(i+1)));

//                System.out.println(currentDigit+ " " + i);
                if (currentDigit == 1){
                    counter1 += 1;
                }
                else{
                    counter0 += 1;
                }

            }
            if(counter1 > counter0){
                common = 1;

            } else {
                common = 0;
            }
            if(counter1 == counter0){
                System.out.println("Equal");
                equalCounts = true;
                common = 1;
            }
            System.out.println("Counter 0 " + counter0);
            System.out.println("Counter 1 " + counter1);

                ListIterator<String> iter1 = scrubber.listIterator();
                while(iter1.hasNext()) {

                    String c = iter1.next();
                    currentDigit = Integer.parseInt(c.substring(i, (i + 1)));

                    if (currentDigit == common) {
//                        System.out.println("Common " + common + " CommonCO2 " + commonC02);
                        iter1.remove();
                        if (scrubber.size() == 1) {
                            c02 = scrubber.get(0);

                        }
                    }
                }

        }

        System.out.println(common);
        System.out.println(generator.size());
        System.out.println(oxygenGen);
        System.out.println(c02);
        //System.out.println(generator.get(0));

        System.out.println(scrubber.size());
        //System.out.println(scrubber.get(0));


        decimalNumber = Integer.parseInt(binary.toString(),2);
        decimalNumber1 = Integer.parseInt(binary1.toString(),2);

        int decimalNumber2 = Integer.parseInt(oxygenGen,2);
        int decimalNumber3 = Integer.parseInt(c02,2);

        System.out.println(decimalNumber2);
        System.out.println(decimalNumber3);

        System.out.println(decimalNumber2*decimalNumber3);



    }

}

