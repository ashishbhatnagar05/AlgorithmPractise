package recusion;

public class PrintNumbers {
    public static void main(String[] args) {
        int num=10;
        printAscending(num);
        System.out.println();
        printDescending(num);
    }

    private static void printDescending(int n) {
        if(n!=0){
            System.out.print(n + " ");
            printDescending(n - 1);
        }
    }


    private static void printAscending(int n) {
        if (n != 0) {
            printAscending(n - 1);
            System.out.print(n + " ");
        }

    }
}
