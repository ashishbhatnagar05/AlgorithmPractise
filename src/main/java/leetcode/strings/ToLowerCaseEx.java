package leetcode.strings;

import org.jetbrains.annotations.TestOnly;

// link: https://leetcode.com/problems/to-lower-case/
public class ToLowerCaseEx {

    public static String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(str.charAt(i));
            }
        }


        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(toLowerCase("LOVELY"));
    }

}

