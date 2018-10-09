package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/robot-return-to-origin/description/
public class RobotReturnToOrigin {

    private static final HashMap<Character, Integer> map = new HashMap<>();

    private static boolean process(String str) {
        if (isEmpty(str)) {
            return true;
        }
        updateMap(str);
        return checkRotation();

    }

    private static boolean checkRotation() {
        boolean flag = true;
        if (map.containsKey('R') || map.containsKey('L')) {
            if ((map.get('R') == null || map.get('L') == null) || (map.get('R') != map.get('L'))) {
                flag = false;
            }
        }
        if (map.containsKey('U') || map.containsKey('D')) {
            if ((map.get('U') == null || map.get('D') == null) || (map.get('U') != map.get('D'))) {
                flag = false;
            }
        }
        return flag;
    }


    private static void updateMap(String str) {

        char[] str_a = str.toCharArray();
        for (int i = 0; i < str_a.length; i++) {
            if (map.containsKey(str_a[i])) {
                map.put(str_a[i], map.get(str_a[i]) + 1);
            } else {
                map.put(str_a[i], 1);
            }
        }
    }

    private static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "RLUURDDDLU";
        System.out.println(process(str));
    }


}
