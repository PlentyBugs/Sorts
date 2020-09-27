public class Main {
    public static void main(String[] args) {
        int n = 30000;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        for (SortAlgorithm sort : new SortAlgorithm[]{
            new BubbleSort(),
            new InsertionSort(),
            new SelectionSort(),
            new HeapSort(),
            new MergeSort(),
            new QuickSort()
        }) {
            int[] arr = new int[n];
            System.arraycopy(array, 0, arr, 0, n);
            long time = System.nanoTime();
            sort.sort(arr);
            System.out.println(sort + " " + (System.nanoTime() - time) / 1_000_000_000.0 + "s");
        }
    }
}
