package L5Q2;
//Write a program that generates 10 non-duplicate random integers within the range from 0 to 20.
import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(21);
            for (int j = 0; j < i; j++) { //iterate each element of i
                if (num[i] == num[j]) { //j always less one than i, so compare the previous one
                    i--;
                    break;
                }
            }
        }
        for(int randNum : num){
            System.out.println(randNum);
        }
    }
}