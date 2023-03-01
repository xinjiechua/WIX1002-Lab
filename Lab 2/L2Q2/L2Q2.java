package L2Q2;
//Write a program to calculate the monthly payment for car loan. The following are the inputs of the program.
// Output the monthly payment in two decimal places.

import java.util.Scanner;
public class L2Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double P, D, R, Y, M;

        System.out.print("Enter the price of the car: ");
        P = sc.nextDouble();
        System.out.print("Enter down payment: ");
        D = sc.nextDouble();
        System.out.print("Enter interest rate in %: ");
        R = sc.nextDouble();
        System.out.print("Enter loan duration in year: ");
        Y = sc.nextDouble();

        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment: RM %.2f" ,M);

    }
}
