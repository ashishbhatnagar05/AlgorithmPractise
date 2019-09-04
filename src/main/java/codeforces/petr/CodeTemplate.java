package codeforces.petr;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeTemplate {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new CodeTemplate.InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(1, in, out);
    out.close();
  }

  static class Task {
    public void solve(int testNumber, CodeTemplate.InputReader in, PrintWriter out) {
      int n = in.nextInt();
      while (n >= 0) {
        String word = in.next();
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

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
