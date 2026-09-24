package main.java.prog1;

import java.util.Locale;
import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P44_CustomerArrival.png"/>
 * </div>
 */
public class P44_CustomerArrival {

    public static void main(String[] args) {
        Random random = new Random();
        int customer1 = random.nextInt(10) + 1;
        int customer2 = random.nextInt(10) + 1 + customer1;
        int customer3 = random.nextInt(10) + 1 + customer2;
        int customer4 = random.nextInt(10) + 1 + customer3;
        int customer5 = random.nextInt(10) + 1 + customer4;
        System.out.println("Customer 1 arrived at minute: "+customer1);
        System.out.println("Customer 2 arrived at minute: "+customer2);
        System.out.println("Customer 3 arrived at minute: "+customer3);
        System.out.println("Customer 4 arrived at minute: "+customer4);
        System.out.println("Customer 5 arrived at minute: "+customer5);
        
        System.out.println("Average waiting time: "+(double)(customer5/5)+" minutes");

        // Write your program here
        // Hint: Simulate customer arrivals with random times and track count

        // output
        // System.out.printf(Locale.US, "Average waiting time: %.2f minutes\n", averageWait);
        
    }
}
