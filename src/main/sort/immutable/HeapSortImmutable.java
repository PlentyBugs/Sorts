package main.sort.immutable;

import main.sort.mutable.HeapSort;

public class HeapSortImmutable extends SortAlgorithmImmutable {
    private final HeapSort sort;

    public HeapSortImmutable() {
        sort = new HeapSort();
    }

    @Override
    protected HeapSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Heap Sort Immutable";
    }
}
