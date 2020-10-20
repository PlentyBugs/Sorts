package main.sort.immutable;

import main.sort.mutable.QuickSortIterative;

public class QuickSortIterativeImmutable extends QuickSortImmutable {
    private final QuickSortIterative sort;

    public QuickSortIterativeImmutable() {
        sort = new QuickSortIterative();
    }

    @Override
    protected QuickSortIterative getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Iterative Immutable";
    }
}
