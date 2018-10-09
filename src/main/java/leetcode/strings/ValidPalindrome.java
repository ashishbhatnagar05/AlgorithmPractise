package leetcode.strings;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

    private static boolean process(final String str) {

        if (isEmpty(str)) {
            return true;
        }
        String replaced = str.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb = new StringBuilder(replaced);
        sb.reverse();
        if (sb.toString().equalsIgnoreCase(replaced)) {
            return true;
        }
        return false;
    }


    private static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(process("A man, a plan, a canal: Panama"));
    }

}
