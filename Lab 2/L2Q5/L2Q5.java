package L2Q5;
//Write a program that generates one random number. The range of the random number is 0 to 10000.
// Display the number and the sum of all the digits in the number

public class L2Q5 {
    public static void main(String[]args){
        int num = (int)(Math.random()*10001);
        int sum = 0;

        System.out.println("Random number: " + num);
        int actualNum = num;
        while(num > 0){
            sum += num % 10;
            num = num/10;
        }
        System.out.println("The sum of all the digits of "  + actualNum + " is : " + sum);
    }
}

