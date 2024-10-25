package Stereometry;

public class RectangularParallelepiped extends ThreeDimensionalShapes implements StereoShape {
    protected final double a;
    private final double b;
    private final double h;

    public RectangularParallelepiped(double a, double b, double c) {
        this.a = (double) Math.round(a * 100) / 100;
        this.b = (double) Math.round(b * 100) / 100;
        this.h = (double) Math.round(c * 100) / 100;
    }

    @Override
    public double area() {
        return 2 * (a * b + b * h + a * h);
    }

    @Override
    public double volume() {
        return a * b * h;
    }

    @Override
    public void introduce() {
        System.out.format("Прямоугольный параллелепипед со сторонами %.2f, %.2f и %.2f\n", a, b, h);
    }
}
