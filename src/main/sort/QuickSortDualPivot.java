package main.sort;

public class QuickSortDualPivot implements QuickSort {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            DoublePivot pivot = doublePartition(array, left, right);
            sort(array, left, pivot.leftPivot - 1);
            sort(array, pivot.leftPivot + 1, pivot.rightPivot - 1);
            sort(array, pivot.rightPivot + 1, right);
        }
    }

    private DoublePivot doublePartition(int[] array, int left, int right) {
        if (array[left] > array[right]) swap(array, left, right);

        int j = left + 1;
        int g = right - 1;
        int k = left + 1;
        int p = array[left];
        int q = array[right];

        while (k <= g) {
            if (array[k] < p) {
                swap(array, k, j++);
            } else if (array[k] >= q) {
                while (array[g] > q && k < g) g--;
                swap(array, k, g--);
                if (array[k] < p) swap(array, k, j++);
            }
            k++;
        }
        swap(array, left, --j);
        swap(array, right, ++g);
        return new DoublePivot(j, g);
    }

    private static class DoublePivot {
        final int leftPivot;
        final int rightPivot;

        public DoublePivot(int leftPivot, int rightPivot) {
            this.leftPivot = leftPivot;
            this.rightPivot = rightPivot;
        }
    }

    @Override
    public String toString() {
        return "Quick Sort Dual Pivot";
    }
}
