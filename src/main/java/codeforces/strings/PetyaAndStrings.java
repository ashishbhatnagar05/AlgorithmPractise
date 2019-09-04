package codeforces.strings;

import java.util.Scanner;

public class PetyaAndStrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next().toLowerCase();
    String str2 = sc.next().toLowerCase();
    int n = str1.length();
    boolean flag = false;
    for (int i = 0; i < n; i++) {
      if (str1.charAt(i) - str2.charAt(i) > 0) {
        System.out.print(1);
        flag = true;
        break;
      } else if (str1.charAt(i) - str2.charAt(i) < 0) {
        System.out.print(-1);
        flag = true;
        break;
      }
    }
    if (!flag) System.out.print(0);
  }
}
