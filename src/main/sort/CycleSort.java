package main.sort;

public class CycleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        int n = array.length;
        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
            int item = array[cycle_start];
            int pos = cycle_start;

            for (int i = cycle_start + 1; i < n; i++)
                if (array[i] < item)
                    pos++;

            if (pos == cycle_start) continue;
            
            while (item == array[pos]) pos++;
            
            if (pos != cycle_start) {
                int temp = item;
                item = array[pos];
                array[pos] = temp;
            }
            
            while (pos != cycle_start) {
                pos = cycle_start;
                for (int i = cycle_start + 1; i < n; i++)
                    if (array[i] < item)
                        pos += 1;

                while (item == array[pos]) pos++;

                if (item != array[pos]) {
                    int temp = item;
                    item = array[pos];
                    array[pos] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return "Cycle Sort";
    }
}
