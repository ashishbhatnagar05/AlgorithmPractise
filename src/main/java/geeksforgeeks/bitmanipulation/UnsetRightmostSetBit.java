package geeksforgeeks.bitmanipulation;
class UnsetRightmostSetBit{

    private static int process(int x) {

        return x & (x-1);
    }
    
        public static void main(String[] args) {
            System.out.println(process(2));
        }
}