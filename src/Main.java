import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> result = new ArrayList<>();

        for (int x : intList) {
            if (x > 0 && x % 2 == 0) {
                result.add(x);
            }
        }
        Collections.sort(result);

//        for (int i = 0; i < result.size(); i++) {
//            for (int j = 0; j < result.size(); j++) {
//                if (result.get(j) > result.get(i) && i != j) {
//                    int tmp = result.get(j);
//                    result.set(j, result.get(i));
//                    result.set(i, tmp);
//                }
//            }
//        }

        System.out.println(result);
    }
}
