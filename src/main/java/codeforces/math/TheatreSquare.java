package codeforces.math;

import java.util.Scanner;

public class TheatreSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float l = sc.nextInt();
    float b = sc.nextInt();
    float a = sc.nextInt();
    l = Math.round(l / a);
    b = Math.round(b / a);
    if (l % a != 0) l++;
    if (b % a != 0) b++;

    System.out.print(l*b);
  }
}
