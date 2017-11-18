import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by mac on 24/07/17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        //System.out.println(fib(100));
        //  printFib(100); 0 1 1 2
        System.out.println(fibWithDP(2, new int[4]));
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }


    public static int fibWithDP(int n, int[] cache) {
        if (n == 0 || n == 1) return 1;

        if (cache[n] == 0) {
            cache[n] = fibWithDP(n-1, cache) + fibWithDP(n-2, cache);
        }
        return cache[n];
    }

    public static void printFib(int n) {
        int a = 0, b = 1;

        for (int i = 1; i < n; i++) {
            System.out.print(a + ",");
            int sum = a + b;
            b = a;
            a = sum;
        }

    }


}
