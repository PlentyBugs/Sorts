public class InsertionSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int elem = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > elem)
                v[j + 1] = v[j--];
            v[j + 1] = elem;
        }
        return v;
    }
}
