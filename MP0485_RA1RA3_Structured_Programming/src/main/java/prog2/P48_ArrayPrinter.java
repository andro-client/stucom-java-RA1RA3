package main.java.prog2;

/**
 * <b>Content</b> array, iterate on elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P48_ArrayPrinter.png">
 */
public class P48_ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        // Hint: Iterate through array and print each element separated by spaces or commas
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
