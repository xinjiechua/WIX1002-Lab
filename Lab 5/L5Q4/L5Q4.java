package L5Q4;
//Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.

public class L5Q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        System.out.println("3 by 3 Matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        //transpose matrix (1st row become 1st column...)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse the elements of each row
        for(int i=0; i< matrix.length; i++){
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][2];
            matrix[i][2] = temp;
        }

        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
