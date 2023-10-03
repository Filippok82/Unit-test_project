package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NumberList {
    private List<Integer> numberList;

    public NumberList() {
        numberList = new ArrayList<>();
    }

    public NumberList(Integer[] numberLis) {
        this.numberList = Arrays.asList(numberLis);
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(Integer[] numberList) {
        this.numberList = Arrays.asList(numberList);

    }

    public List<Integer> randomSetList(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(1,20);
            numberList.add(num);
        }
        return numberList;
    }

    public int getSize() {
        return numberList.size();
    }

    public String getInfo() {
        StringBuilder st = new StringBuilder();
        st.append("Список чисел: ");
        for (Integer i : numberList) {
            st.append(i);
            st.append(", ");
        }
        return st.toString();
    }

}