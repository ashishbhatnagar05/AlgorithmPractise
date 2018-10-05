package TopCoder.StringExamples;

// http://community.topcoder.com/stat?c=problem_statement&pm=14783
public class Ex1 {


    private static void process(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(i);
            if (containsConsecutiveDuplicate(sb.toString())) {
                flag = true;
                System.out.println("Possible");
                break;
            }
        }
        if (flag = false) {
            System.out.println("Impossible");
        }

    }


    private static boolean containsConsecutiveDuplicate(String str) {
        char[] str_array = str.toCharArray();
        boolean flag = false;
        for (int i = 1; i < str_array.length; i++) {
            if (str_array[i - 1] == str_array[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        process("abbba");
    }

}
