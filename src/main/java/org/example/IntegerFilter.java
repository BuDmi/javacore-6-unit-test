package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerFilter {
    private List<Integer> list;

    public IntegerFilter(List<Integer> list) {
        this.list = list;
    }

    public long countOddValues() {
        return list.stream().filter(x -> x % 2 == 0).count();
    }

    public long countOddAndPositiveValuesMoreThanUserVal(int userVal) {
        return list.stream().filter(x -> x > 0 && x % 2 == 0 && x > userVal).count();
    }

    public float countPercentOfPositiveValues() {
        float positiveValCount = (float) list.stream().filter(x -> x > 0).count();
        return (positiveValCount / (float) list.size()) * 100;
    }

    public List<Integer> getListOfPositiveValuesMoreThanUserVal(int userVal) {
        return list.stream().filter(x -> x > 0 && x > userVal).collect(Collectors.toList());
    }
}
