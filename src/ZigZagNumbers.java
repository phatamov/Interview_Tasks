import java.util.LinkedList;
import java.util.List;

class ZigZagNumbers {
    public static void main(String[] args) {
        int output1[] = new int[]{1, 2, 1, 3, 4};
        int output2[] = new int[]{1, 2, 3, 4};
        int output3[] = new int[]{1000000000, 1000000000, 1000000000};

        zigZag(output1);
        zigZag(output2);
        zigZag(output3);
    }

    static void zigZag(int arr[]) {

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length-2; i++) {

            if ((arr[i] > arr[i + 1] && arr[i + 1] < arr[i + 2]) ||
                    (arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2])) {
                list.add(1);
            } else {
                list.add(0);
            }
        }
        System.out.println(list);
    }
}