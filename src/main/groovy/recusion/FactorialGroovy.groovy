package recusion

class FactorialGroovy {

    static void main(String[] args) {
        int n=4
        print(fact(n))
    }

    static int fact(int n){
        if(n==0)
            return 1
        return n * fact(n-1)
    }
}
