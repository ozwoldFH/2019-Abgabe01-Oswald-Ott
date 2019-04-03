package at.fhj.iit;

import java.util.ArrayList;
import java.util.Collections;

public class CalculatorImpl implements Calculator {

    private ArrayList<Integer> list;

    public CalculatorImpl() {
        list = new ArrayList<Integer>();
    }

    public int sum() {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    public int getMaximum() {
        return Collections.max(list);
    }

    public int getMinimum() {
        return Collections.min(list);
    }

    public void addValue(int value) {
        list.add(value);
    }

}
