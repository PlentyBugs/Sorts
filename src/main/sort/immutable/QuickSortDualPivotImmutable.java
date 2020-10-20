package main.sort.immutable;

import main.sort.mutable.QuickSortDualPivot;

public class QuickSortDualPivotImmutable implements QuickSortImmutable {
    public final QuickSortDualPivot sort;

    public QuickSortDualPivotImmutable() {
        sort = new QuickSortDualPivot();
    }

    @Override
    public QuickSortDualPivot getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Dual Pivot Immutable";
    }
}
