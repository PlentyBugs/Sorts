package test;

public class TestWithSmallArray implements ArraySupplier {

    private static final int[] CORRECT_ANSWER = new int[]{-7, -6, -1, 0, 1, 1, 4, 6, 8, 10, 18, 99};

    @Override
    public int[] getCorrectArray() {
        return CORRECT_ANSWER;
    }

    @Override
    public int[] getUnsortedArray() {
        return new int[]{-6, 1, 8, 1, 6, 4, -1, 10, -7, 18, 99, 0};
    }
}
