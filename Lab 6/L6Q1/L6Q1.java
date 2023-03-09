package L6Q1;

public class L6Q1 {
    public static void main(String[] args) {
        System.out.print("Triangular number: ");
        triangularNumber(20);
    }
    static void triangularNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}