package L4Q8;
//*****hard
//Write a program that generates the first n prime number. n is an random integer within 0 to 100.

public class L4Q8 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 101);
        System.out.println(n);
        int m=0; //m = prime printed
        for(int i=2; m<n; i++){
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                m++;
            }
        }
    }
}