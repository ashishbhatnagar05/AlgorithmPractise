package leetcode.strings;

public class RepeatedStringMatch {

    private static int process(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);

        int count = 1;
        if(str1.length()==str2.length() && str1.equals(str2)){
            return count;
        }
        if(str1.contains(str2)){
            return count;
        }

        while (sb.length() <= 10000) {
            sb.append(str1);
            count++;
            if (sb.toString().contains(str2)) {
                return count;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(process("aa", "a"));
    }
}
