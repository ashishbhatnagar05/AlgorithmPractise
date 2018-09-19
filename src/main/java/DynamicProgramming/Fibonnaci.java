package DynamicProgramming;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fibonnaci extends AlgorithmUtility {

    static Map<Integer, Long> fibMap = new LinkedHashMap<Integer, Long>();

    public static void main(String[] args) {
        int input = 9;

        startTime = System.nanoTime();
        System.out.println("fibbonaci of no:(Recursive) " + input + " : " + getRecursiveFib(input));
        printElapsedTime(startTime);

        startTime = System.nanoTime();
        System.out.println("fibbonaci of no:(Recursive with storage) " + input + " : " + getRecursiveFib_With_Storage(input));
        printElapsedTime(startTime);
    }


    private static int getRecursiveFib(int n) {
        if (n <= 1)
            return n;
        return getRecursiveFib(n - 1) + getRecursiveFib(n - 2);
    }

    private static long getRecursiveFib_With_Storage(int n) {
        if (n <= 1)
            return n;
        if (fibMap.containsKey(n))
            return fibMap.get(n);
        else {
            long fib = getRecursiveFib(n - 1) + getRecursiveFib(n - 2);
            fibMap.put(n, fib);
            return fib;
        }
    }

}

