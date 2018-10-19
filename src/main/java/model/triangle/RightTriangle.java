package model.triangle;

public class RightTriangle extends Triangle {

    public RightTriangle(double firstLeg,
                         double secondLeg,
                         double hipotenuse) {
        super(firstLeg, secondLeg, hipotenuse);
        name = "прямоугольный треугольник";
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }
}
