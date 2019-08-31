package hackerrank;

import java.util.Arrays;
import java.util.stream.Stream;

public class MiniMax {

  static void miniMaxSum(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    long max = 0, min = 0;
    for (int i = 0; i < n; i++) {
      if (i >= 0 && i < n - 1) {
        min = min + arr[i];
      }
      if (i > 0 && i < n) {
        max = max + arr[i];
      }
    }
    System.out.print(min + " " + max);
  }

  public static void main(String[] args) {
    int[] arr = new int[] {256741038,623958417,467905213,714532089,938071625};
    //Arrays.stream(arr).forEach(System.out::print);
    miniMaxSum(arr);
  }
}
