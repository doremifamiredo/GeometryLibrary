package Stereometry;

public class Sphere extends ThreeDimensionalShapes implements StereoShape {
    private final double r;

    public Sphere(double r) {
        this.r = (double) Math.round(r * 100) / 100;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2) *4 ;
    }

    @Override
    public double volume() {
        return Math.sqrt(Math.pow(area(), 3) / Math.PI * 36);
    }

    @Override
    public void introduce() {
        System.out.format("Шар с радиусом %.2f\n", r);
    }
}
