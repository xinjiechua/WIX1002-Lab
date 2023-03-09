package L5Q3;
/*Write a program that randomly generate the seven day work hours (1-8 hours) for N employee.
Then, display the work hours in seven days and the total hours for each employee
 */

import java.util.Arrays;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employees: ");
        int N = sc.nextInt();
        int [][] workHours = new int[N][7]; //row = employee; column = days in a week
        int [] total = new int[N];
        System.out.println("Employees\tS  M  T  W  T  F  S   Total");
        for(int i=0; i< workHours.length; i++){
            for(int j=0; j<workHours[i].length; j++){
                workHours[i][j] = (int)(Math.random()*8+1);
                total[i] += workHours[i][j];
            }
        }

       for(int z=0; z< workHours.length; z++){
        System.out.println((z+1)+ "\t\t   " + Arrays.toString(workHours[z])+ "\t" + total[z]);
        }



    }
}
