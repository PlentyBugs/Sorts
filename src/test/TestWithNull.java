package test;

public class TestWithNull implements ArraySupplier {

    @Override
    public int[] getCorrectArray() {
        return null;
    }

    @Override
    public int[] getUnsortedArray() {
        return null;
    }
}
