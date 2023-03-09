package L4Q1;
//Write a program that accepts an integer from user. Then, display its entire factors in increasing order.
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        System.out.print("The factors are: ");

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                System.out.print(i + ", ");
        }
        System.out.println(num);
    }
}
