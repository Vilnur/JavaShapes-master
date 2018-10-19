package model.quadrangle;

public class Trapezium extends Square {
    public Trapezium(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(firstSide, secondSide, thirdSide, fourthSide);
        name = "трапеция";
    }

    @Override
    public double getSquare() {
        double p = (firstSide + secondSide + thirdSide + fourthSide) / 2;
        return (firstSide + secondSide) / (Math.abs(firstSide - secondSide) *
                Math.sqrt((p - firstSide) * ( p - secondSide) * (p - firstSide - thirdSide) *
                        (p - firstSide - fourthSide)));
    }
}
