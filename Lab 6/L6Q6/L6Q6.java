package L6Q6;
/*Write a Java method that determine whether a number is a palindromic prime and another method that
determine whether a number is emirp (the number is a prime number and the reverse also a prime number
and is not palindromic prime). Then, write a Java program to use the methods to display the first 20
palindromic prime and emirp.
(A palindromic number is a number (such as 16461) that remains the same when its digits are reversed.)
 */

public class L6Q6 {
    public static void main(String[] args) {
        int pCount = 0;
        System.out.println("The first 20 palindromic prime: ");
        for(int i=2; pCount<20; i++){
            if(isPalindromic(i)) {
                System.out.print(i + " ");
                pCount++;
            }
        }
        System.out.println("\nThe first 20 emirp: ");

        int eCount = 0;
        for(int i=2; eCount<20; i++){
            if(isEmirp(i)) {
                System.out.print(i + " ");
                eCount++;
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i=2; i<= num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num){
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }

    public static boolean isPalindromic(int num){
        if(num != reverse(num))
            return false;
        return isPrime(num);
    }

    public static boolean isEmirp(int num){
        if(num == reverse(num))
            return false;
        return isPrime(num) && isPrime(reverse(num));
    }
}
