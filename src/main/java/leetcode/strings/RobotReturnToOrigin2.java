package leetcode.strings;

public class RobotReturnToOrigin2 {

    private static boolean process(String str) {
        int x = 0;
        int y = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'R') {
                x++;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(process("LL"));
    }
}
