package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    private final HashMap<String, Integer> map = new HashMap<>();

    public void addEl(String key, int value) {
        map.put(key, value);
    }

    public void deleteEl(String key) {
        map.remove(key);
    }

    public boolean findEl(String key) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
}
