import java.util.Arrays;

/**
 * Created by mac on 25/07/17.
 */
public class CountNumberOfSteps {
    public static void main(String[] args) {
        Integer n = 10000;
        Integer[] cache = new Integer[n + 1];
        Arrays.fill(cache, -1);
        System.out.println(countWaysDP(n, cache));
    }


    public static int countWays(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return countWays(n - 1) + countWays(n - 3) + countWays(n - 5);
    }


    public static int countWaysDP(Integer n, Integer[] cache) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (cache[n] == -1) {
            cache[n] = countWaysDP(n - 1, cache) + countWaysDP(n - 3, cache) + countWaysDP(n - 5, cache);
        }

        return cache[n];
    }
}
