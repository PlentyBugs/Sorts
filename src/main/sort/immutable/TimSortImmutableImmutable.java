package main.sort.immutable;

import main.sort.mutable.TimSort;

public class TimSortImmutableImmutable extends SortAlgorithmImmutable {
    private final TimSort sort;

    public TimSortImmutableImmutable() {
        sort = new TimSort();
    }

    @Override
    protected TimSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "TimSort Immutable";
    }
}
