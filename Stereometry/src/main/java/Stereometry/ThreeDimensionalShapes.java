package Stereometry;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public abstract class ThreeDimensionalShapes implements StereoShape, Comparable<ThreeDimensionalShapes> {

    public void printInfo() {
        this.introduce();
        getInfo().entrySet()
                .forEach(entry ->
                        System.out.printf("%1$s = %2$.2f\n", entry.getKey(), entry.getValue()));
    }

    public Map<String, Double> getInfo(){
        Map<String, Double> geometryInfo = new HashMap<>();
        geometryInfo.put("Площадь", this.area());
        geometryInfo.put("Объём", this.volume());
        return geometryInfo;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        return compareTo((ThreeDimensionalShapes)obj) == 0;
    }

    @Override
    public int compareTo(ThreeDimensionalShapes shape) {
        return Comparator.comparing(ThreeDimensionalShapes::area)
                .thenComparing(ThreeDimensionalShapes::volume)
                .compare(this, shape);
    }
}
