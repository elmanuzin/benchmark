public class FibonacciFactorial {

    public static long fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static long fibonacciNonRecursive(int n) {
        if (n <= 1)
            return n;
        long fib = 1;
        long prevFib = 1;

        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static long factorialRecursive(int n) {
        if (n == 0)
            return 1;
        return n * factorialRecursive(n-1);
    }

    public static long factorialNonRecursive(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < 100; i++) {
            long start = System.nanoTime();
            long fibonacciRecursiveResult = fibonacciRecursive(n);
            long end = System.nanoTime();
            System.out.println("Fibonacci Recursive: " + fibonacciRecursiveResult + " - Time: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            long fibonacciNonRecursiveResult = fibonacciNonRecursive(n);
            end = System.nanoTime();
            System.out.println("Fibonacci Non-Recursive: " + fibonacciNonRecursiveResult + " - Time: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            long factorialRecursiveResult = factorialRecursive(n);
            end = System.nanoTime();
            System.out.println("Factorial Recursive: " + factorialRecursiveResult + " - Time: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            long factorialNonRecursiveResult = factorialNonRecursive(n);
            end = System.nanoTime();
            System.out.println("Factorial Non-Recursive: " + factorialNonRecursiveResult + " - Time: " + (end - start) + " nanoseconds");
        }
    }
}
