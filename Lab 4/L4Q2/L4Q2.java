package L4Q2;
/*Write a program that accepts an integer n from user and then sum the following series.
1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)*/

import java.util.Scanner;
public class L4Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1; i<=n; i++){
            sum += (i*(i+1))/2;
        }
        System.out.println("Sum = " + sum);

    }
}
