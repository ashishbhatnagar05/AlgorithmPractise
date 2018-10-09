package leetcode.strings;

import java.util.regex.Pattern;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseString3 {


    private static String process(final String s) {
        final String regex = " ";
        final String str_a[] = s.split(regex);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_a.length; i++) {
            sb.append(reverseString(str_a[i]));
            if (i == str_a.length-1) {
                continue;
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(process("Let's take LeetCode contest"));
    }
}
