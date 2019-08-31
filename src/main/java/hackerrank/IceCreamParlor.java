package hackerrank;

import java.util.Arrays;

public class IceCreamParlor {

  public static void main(String[] args) {
    int[] arr = new int[] {2,2,4,3};
    int[] result = new int[2];
    int sum = 4;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j && arr[i] + arr[j] == sum) {
          result[0] = j+1;
          result[1] = i+1;
        }
      }
    }
    Arrays.stream(result).forEach(System.out::print);
  }
}
