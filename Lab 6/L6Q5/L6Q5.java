package L6Q5;

import java.util.Scanner;
public class L6Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, score=0;
        do {
            System.out.println("Enter negative number to quit.");
            num1 = (int) (Math.random() * 12);
            num2 = (int) (Math.random() * 12);
            System.out.print(num1 + "x" + num2 + " = ");
            num3 = sc.nextInt();
            if(multiplication(num1, num2, num3))
                score++;
        } while (num3 >= 0);
        System.out.println("Your Score is " + score);

    }
    static boolean multiplication(int num1, int num2,int num3){
        return num3 == num1 * num2;
    }
}
