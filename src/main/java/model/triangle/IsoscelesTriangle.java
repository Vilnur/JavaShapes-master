package model.triangle;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double side, double base) {
        super(side, side, base);
        name = "равнобедренный треугольник";
    }
}
