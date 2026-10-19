package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, searching values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P46_IndexWasNotFound.png">
 */
public class P46_IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");

        // Write your program here
        // Hint: Search for value in array and print index or "not found"
        int searching = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.printf("%d is at index %d.\n", searching, index);
        } else {
            System.out.println(searching + " was not found.");
        }
        // Write your program here
        // Implement the search functionality here
    }

}
