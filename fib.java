public class fib {
    // Function to compute the nth Fibonacci number using memoization
    public static int fib(int n, int f[]) {
        // Base cases: return n if it is 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Check if the result is already computed and stored in f
        if (f[n] != 0) {
            return f[n];
        }
        
        // Compute the nth Fibonacci number and store it in f
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5; // Define the value of n
        int f[] = new int[n + 1]; // Initialize the memoization array with size n+1
        System.out.println(fib(n, f)); // Call the fib function and print the result
    }
}
