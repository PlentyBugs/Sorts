package main.sort.immutable;

import main.sort.mutable.GnomeSort;

public class GnomeSortImmutable implements SortAlgorithmImmutable {
    public final GnomeSort sort;

    public GnomeSortImmutable() {
        sort = new GnomeSort();
    }

    @Override
    public GnomeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Gnome Sort Immutable";
    }
}
