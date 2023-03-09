package L6Q2;

//rite a Java method multiPrint(int n, char c) that prints n copies of character c.
//Then, write a Java program to use the method to display the triangles and diamonds.
//draw triangles and diamonds
//*******hard

import java.util.Scanner;
public class L6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int row = sc.nextInt();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.println("\nTriangle: ");
        int j = 1;
        for (int i = 0; i < row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(2 * j - 1, c);
            System.out.println(" ");
            j += 1;
        }

        //diamond
        System.out.println("\nDiamond:");
        j = 1;
        for (int i = 0; i < row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(2 * j - 1, c);
            System.out.println(" ");
            j += 1;
        }

        j = row - 1;
        for (int i = row - 1; i >= 0; i--) {
            multiPrint((row + 1) - i, ' ');
            multiPrint(2 * j - 1, c);
            System.out.println(" ");
            j--;
        }
    }

    public static void multiPrint(int n, char c) {
        for (int i = 1; i <= n; i++)
            System.out.print(c + " ");
    }
}
