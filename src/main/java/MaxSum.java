import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSum {
    public static void main(String[] args) {
        System.out.println(maxSubSumArray(new int[]{-2, 1, -3, 4}));
        System.out.println(maxSubArray(new ArrayList<>(Arrays.asList(1,2,5,-7,2,5))));
    }

    public static int maxSubSumArray(final int[] A) {
        int newsum = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            newsum = Math.max(newsum + A[i], A[i]);
            max = Math.max(max, newsum);
        }
        return max;
    }


    public static ArrayList<Integer> maxSubArray(final ArrayList<Integer> A) {
        int currentSum = 0, maxSum = 0;
        ArrayList<Integer> currentRanges = new ArrayList<>();
        ArrayList<Integer> maxRanges = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) { //0, 0, -1, 0
            if (A.get(i) >= 0) {
                currentSum += A.get(i);
                currentRanges.add(A.get(i));
                maxSum = Math.max(currentSum, maxSum);
                if (checkTempIsBig(currentRanges, maxRanges)) {
                    maxRanges = currentRanges;
                }
            } else {
                currentSum = 0;
                currentRanges = new ArrayList<>();
            }
        }

        return maxRanges;
    }

    private static Boolean checkTempIsBig(List<Integer> tempMax, List<Integer> maxArray) {
        int tempSum = tempMax.stream().mapToInt(Integer::intValue).sum();
        int maxSum = maxArray.stream().mapToInt(Integer::intValue).sum();

        if (tempSum == maxSum && tempMax.size() < maxArray.size()) {
            return false;
        }
        return tempSum >= maxSum;

    }
}
