package L8Q1;

/*Define a class name Number. The class is used to handle an integer array.
The class Number will display all the item of the array, the even number, the prime number,
the maximum number, the minimum number, the average, the square number. Create a Tester
class to test the program.

        Number a = new Number() // generate 10 random integers within 0 to 100.
        Number b = new Number(5) // generate 5 random integers within 0 to 100.
        Number c = new Number(4, 50) // generate 4 random integers within 0 to 50.
 */

import java.util.Random;

public class Number {
    private int[]num;
    private int size;
    private final int MAX = 100;

    public Number(){
        size = 10;
        num = new int[size];
        Random r = new Random();
        for(int i=0; i<size; i++)
            num[i] = r.nextInt(MAX);
    }

    public Number(int n){
        size = 5;
        num = new int[size];
        Random r = new Random();
        for(int i=0; i<size; i++)
            num[i] = r.nextInt(MAX);
    }

    public Number(int n, int m){
        size = m;
        num = new int[size];
        Random r = new Random();
        for(int i=0; i<size; i++)
            num[i] = r.nextInt(m);
    }

    public void output(){
        System.out.print("The array items are: ");
        for(int i=0; i<size; i++)
            System.out.print(num[i] + " ");
        System.out.println();
        System.out.print("The even numbers are: ");
        for(int i=0; i<size; i++)
            if(isEven(num[i]))
                System.out.print(num[i]+" ");
        System.out.println();
        System.out.print("The prime numbers are: ");
        for(int i=0; i<size; i++)
            if(isPrime(num[i]))
                System.out.print(num[i]+" ");
        System.out.println();
        System.out.println("The maximum number is: " + getMax(num));
        System.out.println("The maximum number is: " + getMin(num));
        System.out.println("The average is: " + getAverage(num));
        System.out.print("The square numbers are:");
        for(int i=0; i<size; i++)
            if(isSquare(num[i]))
                System.out.print(num[i] + " ");
        System.out.println();
        System.out.println(" ");
    }
    public boolean isEven(int a){
        return a % 2 == 0;
    }
    /*public boolean isPrime(int a){
        if(a==2)
            return true;
        else if(a==0||a==1)
            return false;
        else if(a%2==0)
            return false;
        else{
            for(int n=3; n<=a; n+=2)
                if(n==a)
                    return true;
                else if(a%n==0)
                    return false;
        }
        return false;
    }   */

    public boolean isPrime(int a){
        if(a==0||a==1)
            return false;
        for(int i=2; i<=a/2; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }


    public int getMax(int[]a){
        int max = a[0];
        for(int i=0; i<size; i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }
    public int getMin(int[]a){
        int min = a[0];
        for(int i=0; i<size; i++)
            if(a[i] < min)
                min = a[i];
        return min;
    }

    public double getAverage(int[]a){
        double sum = 0.0;
        for(int i=0; i<size;i++)
            sum += a[i];
        return sum/size;
    }

    public boolean isSquare(int a){
        if(a==0)
            return false;
        else{
            for(int i=1; i<=a; i=(i+1)*(i+1))
                if(i == a)
                    return true;
        }
        return false;
    }
}
