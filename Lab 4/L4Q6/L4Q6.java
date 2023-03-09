package L4Q6;
//Write a program that generates a non-negative random integer. Display the number of digits in the integer.

public class L4Q6 {
    public static void main(String[] args) {
        int num = (int)(Math.random()* Integer.MAX_VALUE);

        System.out.println("Number: " + num);

        int digit = 1;

        while((num/=10) != 0)
            digit++;

        System.out.println("Number of digits in the integer: " + digit);
    }
}
