package DynamicProgramming;


public class AlgorithmUtility {
    public static long startTime = 0;
    public static void printElapsedTime(long startTime) {
        long difference = System.nanoTime() - startTime;
        System.out.println("Time elapsed:(In Nanos) " + difference);
    }
}
