package model;

public abstract class Shape {

    //название фигуры
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    //метод вычисления периметра
    public abstract double getPerimeter();

    //метод вычисления площади
    public abstract double getSquare();

    @Override
    public String toString() {
        return name +
                "\n\tпериметр: " + getPerimeter() +
                "\n\tплощадь: " + getSquare();
    }
}
