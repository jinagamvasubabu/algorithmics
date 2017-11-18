import java.util.ArrayList;
import java.util.Collections;

public class AllFactors {
    public static void main(String[] args) {
        System.out.println(new AllFactors().allFactors(109090909));
    }

    public ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> solutions = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                solutions.add(i);
                if (i != Math.sqrt(a)) {
                    solutions.add(a/i);
                }
            }
        }
        Collections.sort(solutions);
        return solutions;
    }
}
