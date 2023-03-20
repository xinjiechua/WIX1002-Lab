package L8Q3;

/*Define a class name WeightCalculator. The class has an input method that accepts the user’s age
 and height. Besides, the class consists a method that calculating the recommend weight with this formula
recommend weight = (height – 100 + age / 10) * 0.9
The class will display the user’s age, height and the recommend weight. Create a Tester class to test the program. */

import java.util.Scanner;

public class WeightCalculator {

    private int age;
    private double height, weight;

    public void input() {
        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
    }

    public void getWeight() {
        weight = (height - 100 + age/10) * 0.9;
    }

    public void output() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommend weight: " + weight);
    }

    public static void main(String[] args) {
        WeightCalculator obj = new WeightCalculator();
        obj.input();
        obj.getWeight();
        obj.output();

    }
}
