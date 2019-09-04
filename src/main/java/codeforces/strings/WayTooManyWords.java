package codeforces.strings;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/71/A
public class WayTooManyWords {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.valueOf(sc.next());
    while (n > 0) {
      String word = sc.next();
      int ln = word.length();
      if (ln > 10) {
        System.out.println(word.charAt(0) + "" + (ln - 2) + "" + word.charAt(ln - 1));
      } else {
        System.out.println(word);
      }
      n--;
    }
  }
}
