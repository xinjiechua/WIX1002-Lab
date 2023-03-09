package L5Q1;
/* Write a program to randomly generate N student scores (0-100). The program will prompt
the user to enter N students and store the score in an array. Then, the program will display
a list of score, the highest score, the lowest score and the average score.
 */
import java.util.Scanner;
public class L5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        int [] score = new int[N];
        int max=0, min=100, sum=0;

        for(int i=0; i<score.length; i++){
            score[i] = (int)(Math.random()*101);
            if(score[i] > max)
                max = score[i];
            if(score[i]<min)
                min = score[i];
            sum += score[i];
            System.out.println("Score of student " + (i+1) + ": " + score[i]);
        }
        double avg = (double)sum/N;
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.printf("Average score: %.2f",avg);
    }
}
