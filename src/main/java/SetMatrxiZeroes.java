import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrxiZeroes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        a.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        a.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        new SetMatrxiZeroes().setZeroes(a);

    }

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        Set<Integer> xCoordinates = new HashSet<>();
        Set<Integer> yCoordinates = new HashSet<>();


        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    xCoordinates.add(i);
                    yCoordinates.add(j);
                }
            }
        }

        for (int i = 0; i < a.size(); i++) {
            if (xCoordinates.contains(i)) {
                for (int k = 0; k < a.get(i).size(); k++) {
                    a.get(i).set(k, 0);
                }
            }
            for (int j = 0; j < a.get(i).size(); j++) {
                if (yCoordinates.contains(j)) {
                    for (int k = i; k < a.size(); k++) {
                        a.get(k).set(j, 0);
                    }
                }
            }
        }
    }
}
