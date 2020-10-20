package main.sort.immutable;

import main.sort.mutable.MergeSortRecursive;

public class MergeSortRecursiveImmutable extends SortAlgorithmImmutable {
    private final MergeSortRecursive sort;

    public MergeSortRecursiveImmutable() {
        sort = new MergeSortRecursive();
    }

    @Override
    protected MergeSortRecursive getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Merge Sort Recursive Immutable";
    }
}
