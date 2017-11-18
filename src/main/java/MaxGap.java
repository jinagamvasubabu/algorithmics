import java.util.Arrays;
import java.util.List;

public class MaxGap {
    public static void main(String[] args) {
        System.out.println(new MaxGap().maximumGap(Arrays.asList(3, 2, 1)));
    }

    public int maximumGap(final List<Integer> a) {

        if (a.size() == 1) {
            return 0;
        }

        int currentMax = 0;
        int max = 0;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) <= a.get(j)) {
                    currentMax = Math.abs(j - i);
                }

                if (currentMax > max) {
                    max = currentMax;
                }
            }
        }

        return max;
    }
}
