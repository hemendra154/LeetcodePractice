public class FibonacciNumber509 {
    //The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    //
    //F(0) = 0, F(1) = 1
    //F(n) = F(n - 1) + F(n - 2), for n > 1.
    //Given n, calculate F(n).
    void print(){
        int s = 7;
        System.out.println(fib(s));
    }
    public int fib(int n) {
        if(n<=1)
            return n;
        int a =0,b=1;
        int sum = 0;
        for(int i = 2; i<=n; i++){
            sum = a+b;
            a= b;
            b= sum;
        }
        return sum;
    }

//    public int fib(int n) {
//        if(n == 0 || n==1)
//            return n;
//        return fib(n-2)+fib(n-1);
//    }
}
