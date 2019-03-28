package at.fhj.iit;

import java.util.ArrayList;

public class CalculatorImpl implements Calculator {

    private ArrayList<Integer> list;

    public CalculatorImpl() {
        list = new ArrayList<Integer>();
    }

    public int sum() {
        return 0;
    }

    public int getMaximum() {
        return 0;
    }

    public int getMinimum() {
        return 0;
    }

    public void addValue(int value) {
        list.add(value);
    }

}
