package codeforces.strings;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/118/A
public class StringTask {

  static final List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u','y');

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in = sc.next().toLowerCase();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < in.length(); i++) {
      if (!vowel.contains(in.charAt(i))) {
        sb.append(".").append(in.charAt(i));
      }
    }
    System.out.print(sb);
  }
}