package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/goat-latin/description/
public class Gaotlatin {

    private static List<Character> vowel;

    static {
        vowel = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    }

    private static String process(String str) {

        if (isEmpty(str)) {
            return str;
        }

        String[] str_a = str.split(" ");
        String[] str_a2 = new String[str_a.length];
        for (int i = 0; i < str_a.length; i++) {
            StringBuilder sb = new StringBuilder(str_a[i]);

            if (vowel.contains(str_a[i].charAt(0))) {
                sb.append("ma");
            } else {
                sb.deleteCharAt(0);
                sb.append(str_a[i].charAt(0));
                sb.append("ma");
            }

            int add_a = i + 1;
            for (int j = 0; j < add_a; j++) {
                sb.append("a");
            }
            str_a2[i] = sb.toString();
        }

        StringBuilder processed = new StringBuilder();
        for (int i = 0; i < str_a2.length; i++) {
            processed = processed.append(str_a2[i]).append(" ");
        }

        return processed.toString().trim();
    }


    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(process(""));
    }
}
