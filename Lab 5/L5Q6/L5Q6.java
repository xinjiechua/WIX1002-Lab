package L5Q6;
import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt();
        int [][] matrix = new int[row][row];

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + row + "row(s)");
        for(int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

}
