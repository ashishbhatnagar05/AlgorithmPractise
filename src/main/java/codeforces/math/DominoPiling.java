package codeforces.math;

import java.util.Scanner;

public class DominoPiling {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    long area = l * b;
    System.out.print(area / 2);
  }
}
