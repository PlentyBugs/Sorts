package main.sort.immutable;

import main.sort.mutable.QuickSortIterative;

public class QuickSortIterativeImmutable implements QuickSortImmutable {
    public final QuickSortIterative sort;

    public QuickSortIterativeImmutable() {
        sort = new QuickSortIterative();
    }

    @Override
    public QuickSortIterative getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Iterative Immutable";
    }
}
