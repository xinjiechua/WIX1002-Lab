package L9Q1;

/*Define a class Shape. The class has a name, perimeter and area. The class has the accessor method and mutator
for perimeter and area. Besides, the class also has a display method to display the name of the shape, perimeter
and area in two decimal points. Derived a class name Rectangle from Shape. The class has the extra side length
variables. The class has a method to accept input for both side length and a method to compute the perimeter and
area. Derived another class name Square from Shape. The class has the extra side length variable. The class has
a method to accept input for side length and a method to compute the perimeter and area. Derived another class
name Circle from Shape. The class has the extra diameter variable. The class has a method to accept input for
diameter and a method to compute the perimeter and area. Create a Tester class to test the program.
 */

public class Shape {
    private String name;
    private double perimeter, area;

    public Shape(String n){
        name = n;
    }

    public void setPerimeter(double a){
        perimeter = a;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setArea(double a){
        area = a;
    }

    public double getArea(double a){
        return area;
    }

    public void display() {
        System.out.println("The Shape is " + name);
        System.out.printf("Perimeter is %.2f\n", perimeter);
        System.out.printf("Area is %.2f\n", area);
        System.out.println(" ");
    }
}
