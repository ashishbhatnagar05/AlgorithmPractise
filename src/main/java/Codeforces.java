import java.util.Scanner;

public class Codeforces {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    while (T > 0) {
      process(in);
      T--;
    }
    in.close();
  }

  private static void process(Scanner in) {
    long n = in.nextLong();
    int m = in.nextInt();
    long sum = 0;
    for (long i = m; i <= n; i = i + m) {
      long last = getlastDigit(i);
      sum += last;
    }
    System.out.println(sum);
  }

  static long getlastDigit(long n) {
    if (n >= 10) return n % 10;
    return n;
  }
}
