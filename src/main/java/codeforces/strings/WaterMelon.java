package codeforces.strings;

import java.util.Scanner;

public class WaterMelon {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number != 2 && number % 2 == 0) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
