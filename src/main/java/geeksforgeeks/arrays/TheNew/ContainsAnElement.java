package geeksforgeeks.arrays.TheNew;

public class ContainsAnElement {

    public static <T> boolean isElementExists(final T[] input, final T v) {
        boolean flag = false;
        for (final T e : input) {
            if (e == v || (v != null && v.equals(e))) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}


