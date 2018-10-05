package DynamicProgramming;

class FindAllCombination {
    public static void main(String[] args) {
        int input = 4;
        System.out.println(algo(6));

    }

    static int algo(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        return algo(n - 1) + algo(n - 3) + algo(n - 5);
    }

}
