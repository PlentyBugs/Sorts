package main.sort.immutable;

import main.sort.mutable.PigeonholeSort;

public class PigeonholeSortImmutable extends SortAlgorithmImmutable {
    private final PigeonholeSort sort;

    public PigeonholeSortImmutable() {
        sort = new PigeonholeSort();
    }

    @Override
    protected PigeonholeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Pigeonhole sort Immutable";
    }
}
