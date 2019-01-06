public class Fibonacci {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        int result = fibonacci(42);
        long time2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(time2 - time1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
