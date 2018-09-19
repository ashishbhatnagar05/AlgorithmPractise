package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;


//Currently the arrays shouldnt be of negative types
public class LongestIncreasingSubsequence extends AlgorithmUtility {
    public static void main(String[] args) {
        int[] input = {10, 22, 9, 33, 21, 50, 41, 60};
        //int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
        startTime = System.nanoTime();
        System.out.println("Longest Consecutive Subsequence: " + getLongestIncreasingSubsequence(input));
        printElapsedTime(startTime);

        System.out.println("Longest Consecutive Subsequence:(count) " + getLongestIncreasingSubsequenceCount(input));
        printElapsedTime(startTime);
    }


    private static int getLongestIncreasingSubsequenceCount(int[] n) {
        if (n.length == 1)
            return 1;
        int max_count = 0;
        for (int j = 0; j < n.length; j++) {
            int a = 0;
            int count = 0;
            for (int i = j; i < n.length; i++) {
                if (n[i] > a) {
                    a = n[i];
                    count++;
                }
            }
            if (count > max_count) {
                max_count = count;
            }
        }
        return max_count;
    }

    private static List<Integer> getLongestIncreasingSubsequence(int[] n) {
        if (n.length == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(n[0]);
        }
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for (int j = 0; j < n.length; j++) {
            ArrayList<Integer> roughList = new ArrayList<Integer>();
            int a = 0;
            for (int i = j; i < n.length; i++) {
                if (n[i] > a) {
                    a = n[i];
                    roughList.add(a);
                }
            }
            if (roughList.size() > finalList.size()) {
                finalList = new ArrayList<Integer>(roughList);
            } else {
                roughList.clear();
            }
        }
        return finalList;
    }

}
