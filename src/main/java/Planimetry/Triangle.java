package Planimetry;

public class Triangle extends PlanarShape implements Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = (double) Math.round(a * 100) / 100;
        this.b = (double) Math.round(b * 100) / 100;
        this.c = (double) Math.round(c * 100) / 100;
    }

    @Override
    public double area() {
        double p = (perimeter() / 2);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void introduce() {
        System.out.format("Треугольник со сторонами %.2f, %.2f и %.2f\n", a, b, c);
    }
}
