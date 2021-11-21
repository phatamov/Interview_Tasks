import java.util.Arrays;
import java.util.List;

public class ListOfIntegers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,4,4,43,35,464,4,10,45,6);


        for (int i = 1; i < list.size(); i++) {
            if (i==9)
                continue;
            System.out.print(list.get(i) + " ");
        }


    }
}
