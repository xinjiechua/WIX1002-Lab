package L6Q3;
import java.util.Arrays;
public class L6Q3v2 {
    public static void main(String[] args) {
        int[] num = {12, 23, 34, 45, 56, 67, 78, 89, 91, 1234};
        reverse(num);
        System.out.println(Arrays.toString(num));

    }

    public static void reverse(int[]num){
        for(int i = 0; i<num.length; i++){
            String str =  String.valueOf(num[i]);
            String rev = "";   //** no space
            for(int j = str.length() -1 ; j>=0; j--)
                rev += str.charAt(j);
            num[i] = Integer.parseInt(rev);
        }
    }

}
