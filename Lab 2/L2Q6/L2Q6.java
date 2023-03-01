package L2Q6;
//6. Write a program that calculates the energy needed to heat water.
//Q = M * (final temperature – initial temperature) * 4184
//M = Weight of water in kg
//Q = Energy in joules
//The temperature are in degree Celsius

import java.util.Scanner;
public class L2Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = sc.nextDouble();
        initialTemp = (initialTemp - 32)/1.8;

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = sc.nextDouble();
        finalTemp = (finalTemp - 32)/1.8;

        double Q = M/100 *(finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %e", Q);
    }
}
