import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("map1", 1);
        map.put("map2", 2);
        map.put("map3", 3);
        map.put("map4", 4);
        map.put("map5", 5);
        map.put("map6", 6);
        map.put("map7", 7);
        map.put("map8", 8);
        map.put("map9", 9);
        map.put("map10", 1);
        map.put("map10", 2);
        map.put("map10", 1);

        ServiceMapIntegers mapIntegers = new ServiceMapIntegers();
        mapIntegers.addObjects("map1", 1);
        mapIntegers.addObjects("map2", 2);
        mapIntegers.addObjects("map3", 3);
        mapIntegers.addObjects("map4", 4);
        mapIntegers.addObjects("map5", 5);
        mapIntegers.addObjects("map6", 6);
        mapIntegers.addObjects("map7", 7);
        mapIntegers.addObjects("map8", 8);
        mapIntegers.addObjects("map9", 9);
//        mapIntegers.addObjects("map9", 9);

        mapIntegers.printObjects();





    }
}