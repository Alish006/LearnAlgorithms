package Fibonacci;

public class Fibonacci {

    public static int FibonacciNth(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return FibonacciNth(n - 1) + FibonacciNth(n - 2);
    }

    public static void  main(String[] args){
        int result = FibonacciNth(6);
        System.out.println(result);
    }
}
