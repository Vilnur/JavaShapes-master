package model.triangle;

import model.Shape;

public class Triangle extends Shape {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    public Triangle(double firstSide,
                    double secondSide,
                    double thirdSide) {
        super("треугольник");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getPerimeter() {
        return firstSide +
                secondSide + thirdSide;
    }

    public double getSquare() {
        double half = getPerimeter() / 2;
        return Math.sqrt(half * (half - firstSide) *
                (half - secondSide) * (half - thirdSide));
    }
}
