package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SherlockArray {

  public static void main(String[] args) {
    //System.out.println(execute());
    System.out.println(execute2());
  }

  private static String execute2() {
    int[] arr = new int[] {2, 0, 0, 0};
    boolean flag = false;
    int left_idx = 0;
    int right_idx = arr.length - 1;
    int left_sum = arr[left_idx];
    int right_sum = arr[right_idx];
    while (left_idx != right_idx) {
      if (left_sum < right_sum) {
        left_idx++;
        left_sum = left_sum + arr[left_idx];
      } else if (left_sum > right_sum) {
        right_idx--;
        right_idx = right_idx + arr[right_idx];
      } else {
        flag = true;
      }
    }

    if (flag) return "YES";
    else return "NO";
  }

  private static String execute() {
    int[] arr = new int[] {2, 0, 0, 0};
    int index = 1;
    int n = arr.length - 1;
    boolean flag = false;
    if (rightSum(arr, 1) == 0) {
      flag = true;
    }
    while (index < n) {
      int leftSum = leftSum(arr, index);
      int rightSum = rightSum(arr, index);
      if (leftSum == rightSum) {
        flag = true;
        break;
      }
      index++;
    }
    if (flag) return "YES";
    else return "NO";
  }

  static int leftSum(int[] arr, int index) {
    int sum = 0;
    for (int i = 0; i < index; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }

  static int rightSum(int[] arr, int index) {
    int sum = 0;
    for (int i = index + 1; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }
}
