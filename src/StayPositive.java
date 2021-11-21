import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StayPositive {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-5,4,-2,3,1,-1,-6,-1,0,-5);
        System.out.println(minStart(arr));
    }

    public static long minStart(List<Integer> arr) {
        List<Integer> sum = new ArrayList<>();
        sum.add(arr.get(0));
        Integer min = sum.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum.add(i, sum.get(i - 1) + arr.get(i));
            min = Math.min(min, sum.get(i));
        }
        if (min > 0) {
            return 1;
        }
        return 1 + -1 * min;
    }
}
