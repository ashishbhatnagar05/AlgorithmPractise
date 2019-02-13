package geeksforgeeks.arrays.TheNew;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayRotationTest {

    private ArrayRotation sut = new ArrayRotation();

    @Test
    public void testSuccess() {
        int[] actualArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rotatedArray = sut.rotateArray(actualArray, 4);
        int[] expectedResult = new int[]{4, 5, 6, 7, 1, 2, 3};
        Assert.assertTrue(Arrays.equals(expectedResult, rotatedArray));
    }

    @Test
    public void testRotateByOne() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        sut.rotateByOne(inputArray);
        int[] expectedResult = new int[]{2, 3, 4, 5, 6, 7, 1};
        Assert.assertTrue(Arrays.equals(expectedResult, inputArray));
    }

}
