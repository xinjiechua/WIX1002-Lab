package L6Q3;

import java.util.Arrays;
public class L6Q3 {
    public static void main(String[] args) {
            int [] num = {12,23,34,45,56,67,78,89,91,1234};
            reverseNum(num);
            System.out.println(Arrays.toString(num));
        }

        public static void reverseNum(int[] num){
            for(int i = 0; i<num.length; i++){
                String number = String.valueOf(num[i]);
                String rev = "";
                for(int j = number.length() -1 ; j>=0; j--){
                    rev += number.charAt(j);
                }
                num[i] = Integer.parseInt(rev);
            }
        }
}
