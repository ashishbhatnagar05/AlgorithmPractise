package codeforces.implementation;

import java.util.Scanner;
//https://codeforces.com/problemset/problem/282/A
public class BitPlusPlus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = 0;
    while (n > 0) {
      String exp = sc.next();
      if (exp.equalsIgnoreCase("X++") || exp.equalsIgnoreCase("++X")) {
        x++;
      } else if (exp.equalsIgnoreCase("X--") || exp.equalsIgnoreCase("--X")) {
        x--;
      }
      n--;
    }
    System.out.print(x);
  }
}
