package main.sort.immutable;

import main.sort.mutable.TimSort;

public class TimSortImmutableImmutable implements SortAlgorithmImmutable {
    public final TimSort sort;

    public TimSortImmutableImmutable() {
        sort = new TimSort();
    }

    @Override
    public TimSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "TimSort Immutable";
    }
}
