import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        System.out.println(new FindPermutation().findPerm("DI", 3));
    }

    public ArrayList<Integer> findPerm(final String A, int B) {

        int max = B;
        int min = 1;

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'I') {
                res.add(min);
                min++;
            } else {
                res.add(max);
                max--;
            }
        }

        if (A.charAt(A.length() - 1) == 'I') {
            res.add(min);
        } else {
            res.add(max);
        }

        return res;
    }
}
