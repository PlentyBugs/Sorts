public class SelectionSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            swap(v, min, i);
        }
        return v;
    }
}
