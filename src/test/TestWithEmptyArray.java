package test;

public class TestWithEmptyArray implements ArraySupplier {
    @Override
    public int[] getCorrectArray() {
        return new int[0];
    }

    @Override
    public int[] getUnsortedArray() {
        return new int[0];
    }
}
