package main.sort.immutable;

import main.sort.mutable.InsertionSortIterative;

public class InsertionSortIterativeImmutable implements SortAlgorithmImmutable {
    public final InsertionSortIterative sort;

    public InsertionSortIterativeImmutable() {
        sort = new InsertionSortIterative();
    }

    @Override
    public InsertionSortIterative getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Insertion Sort Iterative Immutable";
    }
}
