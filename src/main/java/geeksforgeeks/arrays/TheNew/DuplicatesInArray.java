package geeksforgeeks.arrays.TheNew;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInArray {

    //bad logic as it is iterating the loop twice,using a set. iterating through the set again
    public void printDuplicateNumbers(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    set.add(input[i]);
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    //better and uses o(n)
    public void printDuplicateNumbersUsingHashMap(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : input) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
                System.out.print(i + " ");
            }
        }
    }

    public void printDuplicateNumbersusingAbs(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[Math.abs(input[i])] >= 0) {
                input[Math.abs(input[i])] = -input[Math.abs(input[i])];
            } else {
                System.out.println(Math.abs(input[i]) + " ");
            }
        }
    }
}
