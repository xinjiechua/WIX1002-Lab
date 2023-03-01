package L2Q3;
//Write a program that generates three random numbers. The range of the random number is 10 to 50. Display the three
// numbers, sum of the numbers and the average in two decimal places.

import java.util.Random;

public class L2Q3 {
    public static void main(String[]args){
        Random r = new Random();
        int num1 = r.nextInt(41) + 10;
        int num2 = r.nextInt(41) + 10;
        int num3 = r.nextInt(41) + 10;
        int sum = num1 + num2 + num3;
        double average = sum/3.0;

        System.out.println("Three numbers = " + num1 + "," + num2 + "," + num3);
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f",average);
    }

}
