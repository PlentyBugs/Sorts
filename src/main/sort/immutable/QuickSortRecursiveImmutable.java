package main.sort.immutable;

import main.sort.mutable.QuickSortRecursive;

public class QuickSortRecursiveImmutable extends QuickSortImmutable {
    private final QuickSortRecursive sort;

    public QuickSortRecursiveImmutable() {
        sort = new QuickSortRecursive();
    }

    @Override
    protected QuickSortRecursive getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Recursive Immutable";
    }
}
