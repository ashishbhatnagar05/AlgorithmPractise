package leetcode.strings;
//TODO correct this
public class BinaryConversion {

    private static String process(String str1, String str2) {
        if (isEmpty(str1) || isEmpty(str2)) {
            return "";
        }
        long n1 = Long.parseLong(str1, 2);
        long n2 = Long.parseLong(str2, 2);
        return Long.toBinaryString(n1 + n2);
    }


    private static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(process("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "1"));
    }
}
