package test.tests;

import org.junit.jupiter.api.BeforeAll;
import test.SortTest;

import java.util.Arrays;

public class SortTestWithBigArray extends SortTest {

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
    protected int[] getCorrectArray() {
        return correctAnswer;
    }

    @Override
    protected int[] getUnsortedArray() {
        int[] array = new int[SIZE];
        System.arraycopy(unsortedArray, 0, array, 0, SIZE);
        return array;
    }
}
