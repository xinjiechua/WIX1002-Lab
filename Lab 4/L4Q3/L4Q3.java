package L4Q3;

/*Write a program that calculates the minimum, maximum, average and standard deviation (s) of
the exam score in a subject. The program will accepts the score and quit if negative score is enter.
 */

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, min=0, max=0,  sum=0, sqsum=0,avg, var, std;
        int N=0;

        System.out.print("Enter a score [negative score to quit]:");
        score = sc.nextInt();

        if(score>0){
            N++;
            min = score;
            max = score;
            sum += score;
            sqsum += score*score;
        }

        while(score>0){
            if(score>0) {
                N++;
                sum += score;
                sqsum += score * score;
                if (score < min)
                    min = score;
                if (score > max)
                    max = score;
            }
            System.out.print("Enter a score [negative score to quit]:");
            score = sc.nextInt();
        }
        avg = sum/N;
        var = (sqsum - (sum*sum)/N)/(N-1);
        std = Math.sqrt(var);
        System.out.println(var);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f ",avg);
        System.out.printf("Standard Deviation: %.2f ",std);

    }
}