import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiral(A);

    }


    public static void spiral(int[][] A) {
        int T = 0, B = A[0].length - 1, L = 0, R = A[0].length - 1, dir = 0;

        while (T <= B && L <= R) {

            if (dir == 0) {
                // right
                for (int i = L; i <= R; i++) {
                    System.out.println(" " + A[T][i]);
                }
                T++;
            } else if (dir == 1) {
                // bottom
                for (int i = T; i <= B; i++) {
                    System.out.println(" " + A[i][R]);
                }
                R--;
            } else if (dir == 2) {
                // left
                for (int i = R; i >= L; i--) {
                    System.out.println("" + A[B][i]);
                }
                B--;
            } else if (dir == 3) {
                //up
                for (int i = B; i >= T; i--) {
                    System.out.println(" " + A[i][L]);
                }
                L++;
            }
            dir = (dir + 1) % A[0].length;
        }
    }

    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // Populate result;
        int m, n;

        m = A.size();
        n = A.get(0).size();

        int dir = 0; // right
        int row, col, layer;
        row = col = layer = 0;

        result.add(A.get(0).get(0));


        for (int step = 1; step < m * n; step++) {

            switch(dir) {

                // Go right
                case 0:

                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }

                    break;

                // Go down
                case 1:

                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }

                    break;

                // Go left
                case 2:

                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }

                    break;

                // Go up
                case 3:

                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }

                    break;

            }

            //System.out.println(row + " " + col);
            result.add(A.get(row).get(col));

        }




        return result;
    }
}
