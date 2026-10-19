package main.java.prog2;

/**
 * <b>Content</b> array, iterate on elements
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P47_SumOfArray.png">
 */
public class P47_SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 9, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        // Write some code here
        // Hint: Iterates through the array using a for loop and sum all elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // Returns the total sum of the elements.
        return sum;
    }
}
