import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatAndFind {
    public static void main(String[] args) {
        System.out.println(new RepeatAndFind().repeatedNumber(Arrays.asList(3,1,2,5,3)));
    }


    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {

        if (a.size() == 0) {
            return new ArrayList<>();
        }

        Long sum = 0L, missingNumber, duplicateNumber = 0L, n = (long) a.size();
        HashSet<Long> dupSet = new HashSet<>();

        for (int i = 0; i < a.size(); i++) {
            if (duplicateNumber == 0 && dupSet.contains((long)a.get(i))) {
                duplicateNumber = (long)a.get(i);
            }

            sum += a.get(i);
            dupSet.add((long)a.get(i));
        }


        missingNumber = ((n * (n + 1)) / 2) - (sum - duplicateNumber);
        return new ArrayList<>(Arrays.asList((int)(long)duplicateNumber, (int)(long)missingNumber));
    }
}
