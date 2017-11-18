package Math;

import java.util.Arrays;

public class GridUniquePaths {
    public static void main(String[] args) {
        System.out.println(new GridUniquePaths().uniquePaths(100, 1));
    }

    public int uniquePaths(int a, int b) {
        int count = 0;
        int memo[][] = new int[a][b];

        count += findUniquePaths(0, 0, a, b, memo);
        return count;
    }

    private int findUniquePaths(int a, int b, int n1, int n2, int memo[][]) {
        if (a == n1 - 1 || b == n2 - 1) {
            return 1;
        }

        if (a + 1 < n1 && memo[a + 1][b] == 0) {
            memo[a + 1][b] += findUniquePaths(a + 1, b, n1, n2, memo);
        }

        if (b + 1 < n2 && memo[a][b + 1] == 0) {
            memo[a][b + 1] += findUniquePaths(a, b + 1, n1, n2, memo);
        }

        return memo[a + 1][b] + memo[a][b + 1];
    }
}