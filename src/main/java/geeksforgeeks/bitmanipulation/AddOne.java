package geeksforgeeks.bitmanipulation;
class AddOne{

private static int process(int x) {

    return (-(~x));
}

    public static void main(String[] args) {
        System.out.println(process(22));
    }
}