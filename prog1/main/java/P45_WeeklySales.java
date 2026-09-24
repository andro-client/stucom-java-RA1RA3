package main.java.prog1;

import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P45_WeeklySales.png"/>
 * </div>
 */
public class P45_WeeklySales {

    public static void main(String[] args) {
        Random random = new Random();
        int day1 = random.nextInt(151) + 50;
        int day2 = random.nextInt(151) + 50;
        int day3 = random.nextInt(151) + 50;
        int day4 = random.nextInt(151) + 50;
        int day5 = random.nextInt(151) + 50;
        int day6 = random.nextInt(151) + 50;
        int day7 = random.nextInt(151) + 50;
        System.out.println("Day 1: $"+day1);
        System.out.println("Day 2: $"+day2);
        System.out.println("Day 3: $"+day3);
        System.out.println("Day 4: $"+day4);
        System.out.println("Day 5: $"+day5);
        System.out.println("Day 6: $"+day6);
        System.out.println("Day 7: $"+day7);
        System.out.println("Total sales this week(7 days): $"+(int)(day1+day2+day3+day4+day5+day6+day7));

        // Write your program here
        // Hint: Generate random daily sales for each day of the week
        
    }

}
