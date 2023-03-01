package L2Q4;
//Write a program that converts the seconds to hours, minutes and seconds.
import java.util.Scanner;
public class L2Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int second = sc.nextInt();

        int hours = second/3600;
        int minutes = (second % 3600)/60 ;
        int secondLeft = second % 3600 % 60;

        System.out.println(second + " seconds is " + hours + " hours, " + minutes + " minutes and " + secondLeft + " seconds");

    }
}
