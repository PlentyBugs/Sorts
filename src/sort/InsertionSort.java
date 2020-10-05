package sort;

public class InsertionSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int elem = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > elem)
                array[j + 1] = array[j--];
            array[j + 1] = elem;
        }
        return array;
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
