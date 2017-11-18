import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Flip {
    public static void main(String[] args) {
        System.out.println(new Flip().flip("010"));
    }


    public ArrayList<Integer> flip(String A) {
        Map<Integer, String> flipMap = new HashMap<>();
        int currentSum, maxSum = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                currentSum = findOnesAfterTransformation(i, j, A);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (!flipMap.containsKey(currentSum)) {
                    flipMap.put(currentSum, i + "-" + j);
                }
            }
        }
        String[] indexes = flipMap.get(maxSum).split("-");

        int L = Integer.parseInt(indexes[0])+1;
        int R = Integer.parseInt(indexes[1])+1;

        return new ArrayList<>(Arrays.asList(L, R));
    }


    private static int findOnesAfterTransformation(int L, int R, String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.setCharAt(L, '1');
        strBuilder.setCharAt(R, '1');

        int onesCount = 0;
        for (int i = 0; i < strBuilder.length(); i++) {
            if (strBuilder.charAt(i) == '1') {
                onesCount++;
            }
        }
        return onesCount;
    }
}
