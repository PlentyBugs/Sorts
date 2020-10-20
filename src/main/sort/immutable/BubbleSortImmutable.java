package main.sort.immutable;

import main.sort.mutable.BubbleSort;

public class BubbleSortImmutable implements SortAlgorithmImmutable {
    public final BubbleSort sort;

    public BubbleSortImmutable() {
        sort = new BubbleSort();
    }

    @Override
    public BubbleSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Bubble Sort Immutable";
    }
}
