package L6Q4;

public class L6Q4 {
    public static void main(String[] args) {
        int ans = GCD(24,8);
        int ans2 = GCD(200,625);

        System.out.println("GCD of 24 and 8 = " + ans);
        System.out.println("GCD of 200 and 625 = " + ans2);

    }

    static int GCD(int num1, int num2) {
       if(num1 == 0)
           return num2;

       return GCD(num2 % num1, num1);
    }
}
