package L3Q3;

import java.util.Scanner;
public class L3Q3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        double sales = sc.nextDouble();

        if(sales <= 100)
            System.out.printf("Commission = %.2f",0.05*sales);
        else if (sales <= 500)
            System.out.printf("Commission = %.2f",0.075*sales);
        else if (sales <= 1000)
            System.out.printf("Commission = %.2f",0.1*sales);
        else
            System.out.printf("Commission : %.2f",0.125*sales);
    }
}
