package guru.qa;

import java.util.LinkedList;

public class LinkedListClass {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addEl(int El) {
        list.add(El);
    }

    public void deleteEl(int El) {
        list.remove(Integer.valueOf(El));
    }

    public boolean findEl(int El) {
        boolean E = false;
        int i = 0;
        while (!E && i < list.size()) {
            if (list.get(i) == El) {
                E = true;
            }
            i++;
        }
        return E;
    }
}
