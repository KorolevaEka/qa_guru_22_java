package guru.qa;

import java.util.ArrayList;

public class ArrayMethod {

    private ArrayList<String> list = new ArrayList<>();

    public void addEl(String El) {
        list.add(El);
    }

    public void deleteEl(String El) {
        list.remove(El);
    }

    public boolean isContent(String el) {
        for (String item : list) {
            if (item.equals(el)) {
                return true;
            }
        }
        return false;
    }


}
