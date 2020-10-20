package main.sort.immutable;

import main.sort.mutable.GnomeSort;

public class GnomeSortImmutable extends SortAlgorithmImmutable {
    private final GnomeSort sort;

    public GnomeSortImmutable() {
        sort = new GnomeSort();
    }

    @Override
    protected GnomeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Gnome Sort Immutable";
    }
}
