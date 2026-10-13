package main.java.prog2;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P40_CounterWithE.png">
 */
public class P40_CounterWithE {

    public static void main(String[] args) {
        // Write your program here
        // Hint: Print numbers that contain the digit 'e' or match a pattern
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        String n1 = "";
        String n2 = "";
        String n3 = "";
        String n4 = "";

        for (i = 0; i <= 9; i++) {
            if (i == 3) {
                n1 = "E";
            } else {
                n1 = i + "";
            }
            for (j = 0; j <= 9; j++) {
                if (j == 3) {
                    n2 = "E";
                } else {
                    n2 = j + "";
                }
                for (k = 0; k <= 9; k++) {
                    if (k == 3) {
                        n3 = "E";
                    } else {
                        n3 = k + "";
                    }
                    for (l = 0; l <= 9; l++) {
                        if (l == 3) {
                            n4 = "E";
                        }
                        else {
                            n4 = l + "";
                        }
                        System.out.println(n1 + "" + n2 + "" + n3 + "" + n4);
                    }
                }
            }
        }
    }
}
