package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, multidimensional
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P50_LongJumpCompetition.png">
 */
public class P50_LongJumpCompetition {

    public static void main(String[] args) {
        final int MAX_PARTICIPANTS = 10;
        final int DORSAL = 0, BEST_MARK = 1;

        int[][] participants = new int[MAX_PARTICIPANTS][2];
        int count = 0;
        int option;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Register participant");
            System.out.println("2. Show list by dorsals");
            System.out.println("3. Show list by best mark");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (count == MAX_PARTICIPANTS) {
                        System.out.println("List is full.");
                    } else {
                        count = addParticipant(participants, count, scanner, DORSAL, BEST_MARK);
                    }
                    break;

                case 2:
                    sortBy(participants, count, DORSAL);
                    System.out.println("LIST BY DORSAL:");
                    printParticipants(participants, count);
                    break;

                case 3:
                    sortBy(participants, count, BEST_MARK);
                    System.out.println("LIST BY BEST MARK:");
                    printParticipants(participants, count);
                    break;
            }

        } while (option != 4);

        System.out.println("Program terminated.");
    }

    public static int addParticipant(int[][] participants, int count, Scanner scanner, int DORSAL, int BEST_MARK) {
        // Write your code here
        System.out.println("Enter dorsal number:");
        int dorsal = scanner.nextInt();
        System.out.println("Enter best mark:");
        int best_mark = scanner.nextInt();
        System.out.println("Participant registered.");
        participants[count][DORSAL] = dorsal;
        participants[count][BEST_MARK] = best_mark;
//        for (i = 0; i < participants.length; i++) {
//            for (j = 0; j < participants[i].length; j++) {
//                        System.out.println(participants[i][j]);
//            }
//        }
        return count + 1;
    }

    public static void sortBy(int[][] array, int count, int field) {
        // Write your code here
        // Use Bubble Sort algorithm.
        boolean swapped;
        for (int i = 1; i < count; i++) {
            swapped = false;
            for (int index = 0; index < count - i; index++) {
                if (array[index][field] > array[index + 1][field]) {
                    int[] temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printParticipants(int[][] array, int count) {
        System.out.println("Dorsal, BestMark");
        for (int i = 0; i < count; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}