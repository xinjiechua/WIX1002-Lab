package L4Q4;
//Write a program that ask user to enter the year and the first day of the year
// (0 for Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and August.
//***very hard

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of year : ");
        int firstday = sc.nextInt();

        int days;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            days = 31+29+31+30;  //leap year - feb has 29 days
        else
            days = 31+28+31+30;
        firstday += days;
        firstday %= 7;

        System.out.println("----------- May -----------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(int i = 0; i <firstday; i ++)
            System.out.print("  \t");

        for(int i=1; i<=31; i++){
            System.out.print(i + "\t" );
            firstday++;
            if(firstday % 7 ==0)
                System.out.println(" ");
        }

        System.out.println("\n\n");

        firstday += 30 + 31;
        firstday %= 7;
        System.out.println("----------- August ------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(int i = 0; i <firstday; i ++)
            System.out.print("  \t");

        for(int i=1; i<=31; i++){
            System.out.print(i + "\t" );
            firstday++;
            if(firstday % 7 ==0)
                System.out.println(" ");
        }
    }
}