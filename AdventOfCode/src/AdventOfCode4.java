import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;

/*
  Ryan Kimberley
  Advent of Code 12/4/21
  AP Computer Science
 */


public class AdventOfCode4 {
    public static void main(String[] args) throws IOException {

        Scanner scanFile = new Scanner(new File("src/inputDay4.txt"));

        String winningNumbers = scanFile.nextLine();

        String[] currentNumbers = winningNumbers.split(",");


        List<Integer> columns = new ArrayList<>();
        List<List<Integer>> rows = new ArrayList<>();
        List<List<List<Integer>>> boards = new ArrayList<>();

        System.out.println(scanFile.nextLine().length());

        while (scanFile.hasNextLine()) {
            for (int i = 0; i < 5; i++) {
                columns = new ArrayList<>();
                for (int j = 0; j < 5; j++) {
                    columns.add(scanFile.nextInt());
                }
                rows.add(columns);
            }
            boards.add(rows);
            rows = new ArrayList<>();

        }
        System.out.println(boards);

        List<List<Integer>> winningBoard = null;
        game: for (int k = 0; k < currentNumbers.length; k++) {
            String currentSelection = currentNumbers[k];
            int currentDigit = Integer.parseInt(currentSelection);
            System.out.println("Current Digit: " + currentDigit);
            ListIterator<List<List<Integer>>> iter = boards.listIterator();
            board: while (iter.hasNext()) {
                List<List<Integer>> singleBoard = iter.next();

                ListIterator<List<Integer>> iter1 = singleBoard.listIterator();
                while (iter1.hasNext()) {
                    List<Integer> singleRow = iter1.next();

                    ListIterator<Integer> iter2 = singleRow.listIterator();
                    while (iter2.hasNext()) {
                        int singleColumn = iter2.next();
                        if (singleColumn == currentDigit){
                            iter2.set(-1);
//                            break board;
                            winningBoard = checkWinner(boards);
                            if (winningBoard != null) {
                                System.out.println("Winner");
                                break game;
                            }
                        }

                    }


                }

            }
        }

        //System.out.println(boards);
        System.out.println(winningBoard);
    }

    private static List<List<Integer>> checkWinner(List<List<List<Integer>>> boards) {
        boolean winner = false;
        List<Integer> winningRow = null;
        List<Integer> winningColumn = null;
        List<List<Integer>> winningBoard = null;
        board: for (List<List<Integer>> rows : boards) {
//            winningBoard = rows;
            for (List<Integer> columns : rows) {
                int count = 0;
                for (Integer c : columns) {
                    if (c!=-1) {
                        break;
                    }
                    count++;
                    if (count == 5) {
                        winningRow = columns;
                        winningBoard = rows;
                        break board;
                    }
                }

            }
        }
        return winningBoard;
    }
}

//35056 too high