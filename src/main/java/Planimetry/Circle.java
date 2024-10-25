package Planimetry;

public class Circle extends PlanarShape implements Shape {
    private final double r;

    public Circle(double r) {
        this.r = (double) Math.round(r * 100) / 100;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void introduce() {
        System.out.format("Круг с радиусом %.2f\n", r);
    }
}
