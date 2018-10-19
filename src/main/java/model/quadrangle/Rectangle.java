package model.quadrangle;

public class Rectangle extends Parallelogram {
    public Rectangle(double firstSide, double secondSide) {
        super(firstSide, secondSide);
        name = "прямоугольник";
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }
}
