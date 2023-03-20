package L9Q1;

import java.util.Scanner;

public class Square extends Shape{
    private double length1;
    public Square(){
        super("Square");
    }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of square: ");
        length1 = sc.nextDouble();
        compute();
    }

    public void compute(){
        setPerimeter(length1*4);
        setArea(length1*length1);
    }
}
