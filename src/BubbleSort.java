public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] v) {
        for (int i = 0; i < v.length - 1; i++)
            for (int j = i + 1; j < v.length; j++)
                if (v[i] > v[j])
                    swap(v, i, j);
        return v;
    }
}
