package model.triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "равносторонний треугольник";
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }
}
