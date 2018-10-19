package model.quadrangle;

import model.Shape;

public class Square extends Shape {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;

    public Square(double firstSide, double secondSide,
                      double thirdSide, double fourthSide) {
        super("квадрат");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    //вычисление периметра
    public double getPerimeter() {
        return firstSide + secondSide +
                thirdSide + fourthSide;
    }

    //вычисление площади
    public double getSquare() {
        return Math.pow(firstSide, 2);
    }
}
