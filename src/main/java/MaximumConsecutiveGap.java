import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumConsecutiveGap {
    public static void main(String[] args) {
        System.out.println(new MaximumConsecutiveGap().maximumGap(Arrays.asList(1,10,5)));
    }

    public int maximumGap(final List<Integer> a) {
        if (a.size() < 2) {
            return 0;
        }

        Collections.sort(a);

        int currentMax = 0;
        int max = 0;

        for (int i = 0; i < a.size() && i+1 < a.size(); i++) {
            currentMax = a.get(i+1) - a.get(i);
            if (currentMax > max) {
                max = currentMax;
            }
        }

        return max;
    }
}
