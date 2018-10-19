import model.*;
import model.quadrangle.*;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RightTriangle;
import model.triangle.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Triangle(3, 5, 7);
        shapes[1] = new IsoscelesTriangle(3, 4);
        shapes[2] = new EquilateralTriangle(5);
        shapes[3] = new RightTriangle(3, 4, 5);
        shapes[4] = new Square(3, 5, 4, 6);
        shapes[5] = new Parallelogram(3, 4);
        shapes[6] = new Rectangle(5, 6);
        shapes[7] = new Rhombus(5);
        shapes[8] = new Trapezium(7, 12, 3, 4);
        shapes[9] = new Convex_quadrangle(4, 5, 4, 5);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}