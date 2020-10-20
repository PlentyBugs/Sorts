package main.sort.immutable;

import main.sort.mutable.QuickSortDualPivot;

public class QuickSortDualPivotImmutable extends QuickSortImmutable {
    private final QuickSortDualPivot sort;

    public QuickSortDualPivotImmutable() {
        sort = new QuickSortDualPivot();
    }

    @Override
    protected QuickSortDualPivot getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Quick Sort Dual Pivot Immutable";
    }
}
