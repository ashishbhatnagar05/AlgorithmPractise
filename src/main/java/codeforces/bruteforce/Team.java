package codeforces.bruteforce;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/231/A
public class Team {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      if (isConditionvalid(sc)) count++;
      n--;
    }
    System.out.print(count);
  }

  private static boolean isConditionvalid(Scanner sc) {
    int count = 0;
    int num = 3;
    while (num > 0) {
      if (sc.nextInt() == 1) count++;
      num--;
    }
    if (count >= 2) return true;
    return false;
  }
}
