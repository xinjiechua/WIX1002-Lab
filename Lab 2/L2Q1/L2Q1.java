package L2Q1;
//Write a program that convert the temperature in degree Fahrenheit to degree Celsius. The program will display the degree Celsius in two decimal places.
//Celsius = (Fahrenheit – 32) / 1.8

import java.sql.SQLOutput;
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[]args){
        double Fahrenheit, Celsius;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        Fahrenheit = sc.nextDouble();

        Celsius = (Fahrenheit - 32) / 1.8;

        System.out.printf("Temperature in Celsius: %.2f", Celsius);




    }
}

