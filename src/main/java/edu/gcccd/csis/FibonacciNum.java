package edu.gcccd.csis;

import java.math.BigInteger;

public class FibonacciNum {
    private static long times = 0;
    protected static BigInteger fibonacci(BigInteger n, BigInteger x, BigInteger y) {
        if (n.equals(BigInteger.ZERO)) {
            return x;
        }
        if (n.equals(BigInteger.ONE)) {
            return y;
        }
        else {
            times++;
            return fibonacci(n.subtract(BigInteger.ONE), y, x.add(y));
        }
    }

    public static void main (String[] args)
    {
        long initialT = System.currentTimeMillis();
        BigInteger n = BigInteger.valueOf(2000);
        BigInteger fibonacciNumber = fibonacci(n,BigInteger.ZERO,BigInteger.ONE);
        String fibonacciNum = String.valueOf(fibonacciNumber);
        long finalT = System.currentTimeMillis() - initialT;
        System.out.println(String.format("The %d-th Fibonacci Number is %s and was calculated in %d ms\n The fibonacci(..) method got called %d times",n, fibonacciNum, finalT, times));
    }
}