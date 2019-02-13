package geeksforgeeks.arrays.TheNew;

import org.junit.Test;

public class DuplicatesInArrayTest {

    private DuplicatesInArray sut = new DuplicatesInArray();

    @Test
    public void successUsingTwoLoops() {
        int[] input = new int[]{1, 2, 3, 1, 3, 6, 6};
        sut.printDuplicateNumbers(input);
    }


    @Test
    public void successUsingHashMap() {
        int[] input = new int[]{1, 2, 3, 1, 3, 6, 6};
        sut.printDuplicateNumbersUsingHashMap(input);
    }

}
