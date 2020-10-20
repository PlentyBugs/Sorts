package main.sort.immutable;

import main.sort.mutable.MergeSortRecursive;

public class MergeSortRecursiveImmutable implements SortAlgorithmImmutable {
    public final MergeSortRecursive sort;

    public MergeSortRecursiveImmutable() {
        sort = new MergeSortRecursive();
    }

    @Override
    public MergeSortRecursive getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Merge Sort Recursive Immutable";
    }
}
