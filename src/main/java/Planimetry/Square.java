package Planimetry;

public class Square extends Rectangle implements Shape {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public void introduce() {
        System.out.format("Квадрат со сторонами %.2f\n", super.a);
    }
}
