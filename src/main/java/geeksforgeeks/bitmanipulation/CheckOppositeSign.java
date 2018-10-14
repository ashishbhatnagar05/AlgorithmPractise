package geeksforgeeks.bitmanipulation;

class CheckOppositeSign {

    private static boolean process(int x, int y) {
        return ((x ^ y) < 0);
    }

    private static boolean process2(int x, int y) {
        if((x<0 && y>=0)|| (x>=0 && y<0))
            {return true;}
        return false;
    }

    public static void main(String[] args) {
        System.out.println(process(100, -200));
        System.out.println(process2(100, 200));
    }
}