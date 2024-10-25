public class Rectangle extends PlanarShape implements Shape  {
    protected final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = (double) Math.round(a * 100) / 100;
        this.b = (double) Math.round(b * 100) / 100;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public void introduce() {
        System.out.format("Прямоугольник со сторонами %.2f и %.2f\n", a, b);
    }


}
