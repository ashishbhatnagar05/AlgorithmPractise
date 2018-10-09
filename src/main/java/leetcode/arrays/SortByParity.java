package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/sort-array-by-parity/description/
public class SortByParity {

    private static int[] process(int[] a) {

        if (a.length == 0) {
            return a;
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }
        even.addAll(odd);

        for (int i = 0; i < even.size(); i++) {
            a[i] = even.get(i).intValue();
        }

        return a;
    }

    private static int[] convertListOfIntegerToArray(List<Integer> list) {
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i).intValue();
        }
        return a;
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int begin = 0;
        int end = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            //[3,1,2,4]
            if (A[i] % 2 == 0) {
                arr[begin++] = A[i];
            } else {
                arr[end--] = A[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //iterateArray(process(new int[]{3, 1, 2, 4}));
        iterateArray(sortArrayByParity(new int[]{3, 1, 2, 4}));

    }


    private static void iterateArray(int[] a) {
        for (int n : a) {
            System.out.print(n);
        }
    }
}
