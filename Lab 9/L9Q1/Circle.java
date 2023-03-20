package L9Q1;

import java.util.Scanner;
public class Circle extends Shape{
    private double diameter;
    public Circle(){
        super("Circle");
    }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of circle:");
        diameter = sc.nextDouble();
        compute();
    }

    public void compute(){
        setPerimeter(diameter*Math.PI);
        setArea(diameter*diameter*Math.PI/4);
    }
}
