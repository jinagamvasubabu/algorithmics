public class SampleTest {

    public static void main(String[] args) {
        System.out.println(get(4, 2));
    }

    public static String get(int l, int c) {

        int a[][] = new int[l+1][c+2], i, j;
        for (i = 0; i < l+1; i++) {
            for (j = 0; j <=i; j++) {
                if (j == 0 || i == j || j == i+1)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }

        return ""+a[l][c];
    }

}
