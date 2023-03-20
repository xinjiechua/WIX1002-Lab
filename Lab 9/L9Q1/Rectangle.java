package L9Q1;
import java.util.Scanner;

public class Rectangle extends Shape{
    private double length1, length2;
        public Rectangle() {
            super("Rectangle");
        }
        public void getInput(){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the sides length of rectangle:");
            length1 = sc.nextDouble();
            length2 = sc.nextDouble();
            compute();
        }
        public void compute(){
            setPerimeter(length1*2+length2*2);
            setArea(length1*length2);
        }
}
