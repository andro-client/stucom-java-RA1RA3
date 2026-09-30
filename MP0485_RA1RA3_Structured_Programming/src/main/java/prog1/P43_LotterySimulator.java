package main.java.prog1;

import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P43_LotterySimulator.png"/>
 * </div>
 */
public class P43_LotterySimulator {

    public static void main(String[] args) {
        Random random = new Random();
        int lottery1 = random.nextInt(49) + 1;
        int lottery2 = random.nextInt(49) + 1;
        int lottery3 = random.nextInt(49) + 1;
        int lottery4 = random.nextInt(49) + 1;
        int lottery5 = random.nextInt(49) + 1;
        int lottery6 = random.nextInt(49) + 1;
        String lotteryfinal = lottery1+" "+lottery2+" "+lottery3+" "+lottery4+" "+lottery5+" "+lottery6;
        System.out.println("Your numbers: "+lotteryfinal);
        

        // Write your program here
        // Hint: Generate random lottery numbers and check if they match
        

    }
}
