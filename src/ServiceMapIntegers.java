import java.util.*;


public class ServiceMapIntegers {
    private Map<String, Integer> hashMap = new LinkedHashMap<>();

    public void addObjects(String string, Integer integer) {
        if (hashMap.containsKey(string)) {
            if (integer.equals(hashMap.get(string))) {
                throw new RuntimeException("ошибка добавления существующего объекта");
            }
        } else {
            hashMap.put(string, integer);
        }
    }

    public void printObjects() {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("%s : %d%n", entry.getKey(), entry.getValue());
        }
    }

}
