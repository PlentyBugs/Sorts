package test;

import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;

public class TestWithBigArray implements ArraySupplier {

    private static int[] correctAnswer;
    private static int[] unsortedArray;
    private static final int SIZE = 30000;

    @BeforeAll
    static void doPreparations() {
        correctAnswer = new int[SIZE];
        unsortedArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            int item = (int) (Math.random() * 100000);
            correctAnswer[i] = item;
            unsortedArray[i] = item;
        }
        Arrays.sort(correctAnswer);
    }

    @Override
    public int[] getCorrectArray() {
        return correctAnswer;
    }

    @Override
    public int[] getUnsortedArray() {
        int[] array = new int[SIZE];
        System.arraycopy(unsortedArray, 0, array, 0, SIZE);
        return array;
    }
}
