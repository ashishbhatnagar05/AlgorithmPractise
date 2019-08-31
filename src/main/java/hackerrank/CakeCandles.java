package hackerrank;

public class CakeCandles {

  static void execute(int[] arr) {
    long count = 0;
    long max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        count = 0;
        max = arr[i];
        count++;
      } else if (arr[i] == max) {
        count++;
      }
    }
    System.out.print(count);
  }

  public static void main(String[] args) {
    int[] input = new int[] {3, 2, 1, 3};
    execute(input);
  }
}
