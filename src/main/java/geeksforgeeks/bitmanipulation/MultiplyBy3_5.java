package geeksforgeeks.bitmanipulation;
class MultiplyBy3_5{
    private static int process(int x) {

        return (x<<1)+x+(x>>1);
    }
    
        public static void main(String[] args) {
            System.out.println(process(2));
        }
}