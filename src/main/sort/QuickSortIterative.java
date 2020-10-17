package main.sort;

public class QuickSortIterative implements QuickSort {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        int start = 0;
        int end = array.length - 1;

        int[] stack = new int[end - start + 1];

        int top = -1;

        stack[++top] = start;
        stack[++top] = end;

        while (top >= 0) {
            end = stack[top--];
            start = stack[top--];

            int pivot = partition(array, start, end);

            if (pivot - 1 > start) {
                stack[++top] = start;
                stack[++top] = pivot - 1;
            }

            if (pivot + 1 < end) {
                stack[++top] = pivot + 1;
                stack[++top] = end;
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return "Quick Sort Iterative";
    }
}
