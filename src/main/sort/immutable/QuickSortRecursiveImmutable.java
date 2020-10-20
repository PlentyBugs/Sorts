package main.sort.immutable;

import main.sort.mutable.QuickSortRecursive;

public class QuickSortRecursiveImmutable implements QuickSortImmutable {
    public final QuickSortRecursive sort;

    public QuickSortRecursiveImmutable() {
        sort = new QuickSortRecursive();
    }

    @Override
    public QuickSortRecursive getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Recursive Immutable";
    }
}
