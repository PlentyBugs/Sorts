package main.sort.immutable;

import main.sort.mutable.PigeonholeSort;

public class PigeonholeSortImmutable implements SortAlgorithmImmutable {
    public final PigeonholeSort sort;

    public PigeonholeSortImmutable() {
        sort = new PigeonholeSort();
    }

    @Override
    public PigeonholeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Pigeonhole sort Immutable";
    }
}
