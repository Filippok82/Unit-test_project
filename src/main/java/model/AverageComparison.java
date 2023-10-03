package model;


public class AverageComparison extends NumberList {
    private double average;



    public double findAverage(NumberList list) {
        double sum = 0;
        for (int i = 0; i < list.getSize(); i++) {
            sum += list.getNumberList().get(i);
        }
        average = sum / list.getSize();
        return average;
    }

    public String comparisonValues(NumberList list1, NumberList list2) {
        double l1 = findAverage(list1);
        double l2 = findAverage(list2);
        if (l1 > l2) {
            return "Среднее значение первого списка больше";
        } else if (l1 == l2) {
            return "Средние значения списков равны";
        } else {
            return "Среднее значение второго списка больше";
        }
    }


}
