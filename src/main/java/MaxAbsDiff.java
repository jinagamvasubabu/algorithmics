import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxAbsDiff {
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,-1));
        System.out.println(new MaxAbsDiff().maxArr(input));
    }

    public int maxArr(ArrayList<Integer> A) {

        int currentSum, maxSum = 0;


        if (A.size() == 0) {
            return maxSum;
        }

        if (A.size() == 1) {
            return A.get(0);
        }

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                currentSum = Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
