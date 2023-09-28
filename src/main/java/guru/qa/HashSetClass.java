package guru.qa;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    private final HashSet<Double> set = new HashSet<>();

    public void addEl(double El) {
        set.add(El);
    }

    public void deleteEl(double El) {
        set.remove(El);
    }

    public boolean findEl(double El) {
        boolean R = false;
        Iterator<Double> iterator = set.iterator();
        do {
            double currentEl = iterator.next();
            if (currentEl == El) {
                R = true;
                break;
            }
        } while (iterator.hasNext());
        return R;
    }

}
