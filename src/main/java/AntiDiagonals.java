import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        a.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        a.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println(new AntiDiagonals().diagonal(a));
    }

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int dimension = a.size();
        for (int i = 0; i < dimension*2-1; i++) {
            result.add(getDiagonal(i, a));
        }
        return result;
    }

    public ArrayList<Integer> getDiagonal(int layer, ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= layer; i++) {
            int j = layer-i;
            if (i < a.size() && j < a.size()) {
                result.add(a.get(i).get(j));
            }
        }
        return result;
    }
}
