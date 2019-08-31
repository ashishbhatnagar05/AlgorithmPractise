package hackerrank;

public class StairCase {
  public static void main(String[] args) {
    int n = 3;
    for (int i = 0; i < n; i++) {
      for (int j = 2 * (n - i); j >= 0; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.println("#");
      }
      System.out.println();
    }
  }
}
