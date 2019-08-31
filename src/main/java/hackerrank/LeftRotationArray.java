package hackerrank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LeftRotationArray {

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4, 5};
    ArrayDeque<Integer> deque =
        Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayDeque<Integer>::new));
    int k = 2;
    while (k != 0) {
      int element = deque.removeLast();
      deque.addLast(element);
      k--;
    }
    System.out.println(deque);
  }
}
