package main.sort.immutable;

import main.sort.mutable.BubbleSort;

public class BubbleSortImmutable extends SortAlgorithmImmutable {
    private final BubbleSort sort;

    public BubbleSortImmutable() {
        sort = new BubbleSort();
    }

    @Override
    protected BubbleSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Bubble Sort Immutable";
    }
}
