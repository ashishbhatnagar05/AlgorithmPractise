package geeksforgeeks.bitmanipulation;

class CountSetBitsInInteger{
    private static int process(int x) {

        int count=0;
        while(x>0){
            x=x & (x-1);
            count++;
        }
        return count;
       
    }
    
        public static void main(String[] args) {
            System.out.println(process(9));
        }
}
