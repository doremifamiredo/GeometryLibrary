import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public abstract class PlanarShape implements Shape, Comparable<PlanarShape> {

    public void printInfo() {
        this.introduce();
        getInfo().entrySet()
                .forEach(entry ->
                    System.out.printf("%1$s = %2$.2f\n", entry.getKey(), entry.getValue()));
    }

    public Map<String, Double> getInfo(){
        Map<String, Double> geometryInfo = new HashMap<>();
        geometryInfo.put("Площадь", this.area());
        geometryInfo.put("Периметр", this.perimeter());
        return geometryInfo;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        return compareTo((PlanarShape)obj) == 0;
    }

    @Override
    public int compareTo(PlanarShape shape) {
        return Comparator.comparing(PlanarShape::area)
                .thenComparing(PlanarShape::perimeter)
                .compare(this, shape);
    }
}
