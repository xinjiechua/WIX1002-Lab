package L5Q5;

import java.util.Arrays;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[20];

        for(int i=0; i<num.length; i++) {
            num[i] = (int) (Math.random() * 101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.print(Arrays.toString(num));

        for(int i=0; i<num.length; i++) {
            for(int j=0; j< num.length-1; j++){
                if(num[j] < num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("\nArray in descending order");
        System.out.println(Arrays.toString(num));

        System.out.print("Enter a number to search:  ");
        int search = sc.nextInt();

        //linear search
        int i;
        boolean status = false;
        for(i=0; i<num.length; i++)
            if(num[i] == search){
                status = true;
                break;
            }
        if(status) {
            System.out.println(search + " found");
            System.out.println("Linear Search - " + i + "loop(s)");
        }
        else
            System.out.println("Linear search - " + search + " not found");


        //binary search
        //Array order descending -> greater than
        //Array order ascending -> smaller than

        int count = 0,low= 0, high = num.length -1;
        status = false;

        while(low <= high) {
            count++;
            int middle = (low + high) / 2;

            if (num[middle] == search) {
                status = true;
                break;
            } else if (num[middle] > search)
                low = middle + 1;
            else
                high = middle - 1;
        }
        if(status){
            System.out.println(search + " found");
            System.out.println("Binary Search - " + count + "loop(s)");
        } else{
            System.out.println("Binary Search - " + search + "not found");
        }
    }
}
