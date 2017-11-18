import java.util.ArrayList;

public class SquareSum {
    public static void main(String[] args) {
        System.out.println(new SquareSum().squareSum(10));
    }

    public ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int a = 0; a * a < A; a++) {
            for (int b = 0; b * b < A; b++) {
                if ((a * a + b * b == A) && (a <= b)) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                }
            }
        }
        return ans;
    }
}
