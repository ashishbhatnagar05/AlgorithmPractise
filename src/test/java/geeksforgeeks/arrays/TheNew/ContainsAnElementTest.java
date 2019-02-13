package geeksforgeeks.arrays.TheNew;

import org.junit.Assert;
import org.junit.Test;

public class ContainsAnElementTest {

    @Test
    public void success() {
        Assert.assertTrue(ContainsAnElement.isElementExists(new Integer[]{1, 2, 3, 4, 5}, 2));
        Assert.assertFalse(ContainsAnElement.isElementExists(new Integer[]{1, 2, 3, 4, 5}, 89));
        Assert.assertTrue(ContainsAnElement.isElementExists(new String[]{"ashish","aman"}, "aman"));
        Assert.assertFalse(ContainsAnElement.isElementExists(new String[]{"ashish","aman"}, 14));
    }
}
