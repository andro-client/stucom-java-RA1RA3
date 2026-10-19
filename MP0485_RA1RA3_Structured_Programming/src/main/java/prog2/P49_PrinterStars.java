package main.java.prog2;

/**
 * <b>Content</b> array, iterate on elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P49_PrinterStars.png">
 */
public class P49_PrinterStars {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);

    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        // Hint: For each number in array, print that many stars on a line
        int num = 0;
        String stars = "*"; 
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i]; j++) {
                System.out.print(stars);
            }
            System.out.println();
        }
    }
}
