package main.sort.mutable;

public class GnomeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return array;
        int position = 0;
        while (position < array.length)
            if (position == 0 || array[position] >= array[position - 1])
                position++;
            else
                swap(array, position - 1, position--);
        return array;
    }

    @Override
    public String toString() {
        return "Gnome Sort";
    }
}
