package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StaticMethodreference {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.stream()
        .map(
            (x) -> {
              if (x % 2 == 0) return "ashish";
              else return "amit";
            })
        .forEach(System.out::print);

    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce((x, y) -> x * y).ifPresent(System.out::println);

    IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .boxed()
        .sorted((x, y) -> y.compareTo(x))
        .forEach(System.out::println);

    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .collect(Collectors.toCollection(TreeSet::new))
        .forEach(System.out::print);

    System.out.println(fib(11));
    System.out.println(fact(5));
  }

  public static int fib(int n) {
    if (n <= 1) return n;
    else return fib(n - 1) + fib(n - 2);
  }

  public static int fact(int n) {
    if (n <= 1) return 1;
    else {
      return n * fact(n - 1);
    }
  }
}
