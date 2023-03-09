package L4Q7;

import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P, i,M, C, R, L, totalInterest=0;
        int N,n;
        System.out.print("Enter principal amount: ");
        P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = sc.nextInt();

        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance\t\tTotal Interest");
        M = (P*(i/(12*100)))/(1-Math.pow(1+(i/(12*100)),-N));

        for (n=1; n<=N; n++) {
            C = M * Math.pow((1 + i / 1200), -(1 + N - n));
            L = M -C;
            R = L/(i/1200) - C;
            totalInterest += L;
            System.out.printf("%-4d%20.2f%15.2f%15.2f%20.2f%18.2f\n",n,M,C,L,R,totalInterest);

        }
    }
}
