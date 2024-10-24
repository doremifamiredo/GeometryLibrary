package Planimetry;

import java.util.HashMap;
import java.util.Map;

public abstract class PlanarShape implements Shape {

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
}
