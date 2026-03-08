package Fibonacci;

public class Fibonacci {

    public static int fibonacciNth(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciNth(n - 1) + fibonacciNth(n - 2);
    }

    public static void  main(String[] args){
        int result = fibonacciNth(6);
        System.out.println(result);
    }
}
