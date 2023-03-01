package L3Q6;
//Write a program that asks users to enter the radius of a circle and a coordinate point (x, y).
// Determine whether the point is inside or outside the circle centered at (0, 0).

import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius,x,y;

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.print("Enter radius: ");
        radius = sc.nextInt();

        if((x*x + y*y) > radius*radius)
            System.out.println("The point is outside the circle centered at (0,0).");
        else
            System.out.println("The point is inside the circle centered at (0,0).");
    }
}
