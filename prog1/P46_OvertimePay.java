package main.java.prog1;

/**
 * <div class="block">
 * <strong>Business logic</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P46_OvertimePay.png"/>
 * </div>
 */
public class P46_OvertimePay {

    public static final String EURO_SYMBOL = "\u20AC";

    public static void main(String[] args) {

        // Fix the program to get the expected output
        final int overtimeHours = 10;
        final double hourlyRate = 20.0;
        final double overtimeMultiplier = 1.5;
        final double bonus = 100.0;

        double overtimePay = overtimeHours * hourlyRate * overtimeMultiplier;
        double totalPay = overtimePay + bonus;

        System.out.println("Overtime pay: " +  overtimePay + EURO_SYMBOL);
        System.out.println("Total pay including bonus: " +  totalPay +  EURO_SYMBOL);

    }
}
