package model.service;

import model.AverageComparison;
import model.NumberList;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Service {

    AverageComparison average;
    NumberList list1;
    NumberList list2;


    public Service() {
        this.average = new AverageComparison();
        this.list1 = new NumberList();
        this.list2 = new NumberList();
    }




    public String getAverageList() {
        StringBuilder st = new StringBuilder();
        if (list1.getSize() == 0 || list2.getSize() == 0 || average.findAverage(list1) == 0.0 || average.findAverage(list2) == 0.00) {
            st.append("нет данных");
        } else {
            st.append(average.comparisonValues(list1, list2));
        }
        return st.toString();
    }


    public String randomListService(Integer size) {
        list1.randomSetList(size);
        list2.randomSetList(size);
        return list1.getInfo() + list2.getInfo();

    }

}

