package main.sort.immutable;

import main.sort.mutable.HeapSort;

public class HeapSortImmutable implements SortAlgorithmImmutable {
    public final HeapSort sort;

    public HeapSortImmutable() {
        sort = new HeapSort();
    }

    @Override
    public HeapSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Heap Sort Immutable";
    }
}
