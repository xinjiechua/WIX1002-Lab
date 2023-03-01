package L3Q5;

/*Cramer’s rule is used to solve the linear equations.
ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x and y.
If ad – bc is equal to 0. Display "The equation has no solution"
 */
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, x, y;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
        System.out.print("Enter d: ");
        d = sc.nextInt();
        System.out.print("Enter e: ");
        e = sc.nextInt();
        System.out.print("Enter f: ");
        f = sc.nextInt();

        if((a*d - b*c) != 0) {
            x = (e * d - b * f) / (a * b - b * c);
            y = (a * f - e * c) / (a * d - b * c);

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
        else
            System.out.println("The equation has no solution");
    }
}
