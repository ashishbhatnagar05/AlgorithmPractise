package leetcode.strings;

import java.util.*;

public class MorseCode {

    private static final List<Character> alphabets;

    private static final List<String> morseCodes;

    static {
        alphabets = Collections.unmodifiableList(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        morseCodes = Collections.unmodifiableList(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."));
    }

    private static int process(String a[]) {
        Set<String> set = new HashSet<>();
        for (String str : a) {
            char[] c_ar = str.toCharArray();
            set.add(getMorseValue(c_ar));
        }
        return set.size();
    }

    private static String getMorseValue(char[] c_ar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c_ar.length; i++) {
            int index = alphabets.indexOf(c_ar[i]);
            sb.append(morseCodes.get(index));
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(process(new String[]{}));
    }
}
