package Stereometry;

public class Cube extends RectangularParallelepiped implements StereoShape{

    public Cube(double a) {
        super(a, a, a);
    }

    @Override
    public void introduce() {
        System.out.format("Куб со сторонами %.2f\n", super.a);
    }
}
