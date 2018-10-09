package leetcode.strings;

public class StrStr {

    private static int process(String haystack, String needle) {
        if (isEmpty(haystack) && !isEmpty(needle)) {
            return -1;
        }
        if (isEmpty(haystack) && isEmpty(needle)) {
            return 0;
        }
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }

    }

    private static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(process("aaaaa", "bba"));
    }


}
