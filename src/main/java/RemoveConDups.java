import java.util.ArrayList;
import java.util.List;

public class RemoveConDups {
    public static void main(String[] args) {
        String input = "aabbcdccdce";
        System.out.println(new RemoveConDups().recursiveFind(input));
    }

    private String recursiveFind(String input) {
        if (input.length() == 0) {
            return input;
        }

        List<Integer> commonIndexes = findCommonIndexes(input.toCharArray());
        if(commonIndexes.isEmpty()) {
            return input;
        }

        StringBuilder tempInput = new StringBuilder();

        for(int i=0; i< input.length(); i++) {
            if (!commonIndexes.contains(i)) {
                tempInput.append(input.charAt(i));
            }
        }
        return recursiveFind(tempInput.toString());
    }

    private static List<Integer> findCommonIndexes(char[] output) {
        List<Integer> locationsToRemove = new ArrayList<>();
        for (int i = 0; i < output.length; i++) {
            if (i + 1 < output.length && output[i] == output[i + 1]) {
                locationsToRemove.add(i);
                locationsToRemove.add(i + 1);
            }
        }
        return locationsToRemove;
    }
}
