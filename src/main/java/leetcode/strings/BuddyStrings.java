package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {

    private static boolean process(String A, String B) {

        if (A.isEmpty() && !B.isEmpty()) {
            return false;
        }
        if (A.isEmpty() && B.isEmpty()) {
            return true;
        }

        if (A.equals(B)) {
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray()) s.add(c);
            return s.size() < A.length();
        }

        for (int i = 1; i < A.length(); i++) {
            char[] A_a = A.toCharArray();
            char temp = A_a[i];
            A_a[i] = A_a[i - 1];
            A_a[i - 1] = temp;

            StringBuilder sb = new StringBuilder();
            for (char ch : A_a) {
                sb.append(ch);
            }
            if (sb.toString().equalsIgnoreCase(B)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(process("abab","abab"));
    }
}
