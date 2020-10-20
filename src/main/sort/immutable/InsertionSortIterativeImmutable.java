package main.sort.immutable;

import main.sort.mutable.InsertionSortIterative;

public class InsertionSortIterativeImmutable extends SortAlgorithmImmutable {
    private final InsertionSortIterative sort;

    public InsertionSortIterativeImmutable() {
        sort = new InsertionSortIterative();
    }

    @Override
    protected InsertionSortIterative getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Insertion Sort Iterative Immutable";
    }
}
