package L9Q1;

public class Tester {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getInput();
        rec.compute();
        rec.display();

        Square sq = new Square();
        sq.getInput();
        sq.compute();
        sq.display();

        Circle circle = new Circle();
        circle.getInput();
        circle.compute();
        circle.display();
    }
}
