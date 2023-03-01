package L3Q1;
//Write a program that stimulates a simple calculator. It reads two integers and a character.
// If the character is a +, the sum is printed; if it is a -, the difference is printed;
// if is a *, the multiplication is printed; if it is a /, the quotient is printed; and
// if it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)

import java.util.Scanner;
public class L3Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, ans=0;

        System.out.print("Enter two integer number: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        switch(operand) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1*num2;
                break;
            case '/':
                ans = num1/num2;
                break;
            case '%':
                ans = num1 % num2;
        }

        System.out.println(num1 + " " + operand + " " + num2 + " = " + ans);
    }
}
