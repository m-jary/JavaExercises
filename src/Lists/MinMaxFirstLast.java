package Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxFirstLast {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 7, 10, 4, 3, 4, 2, 8, 10));

        int max = Integer.MIN_VALUE;
//        int max = numbers.get(0);
        int firstIndex = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                firstIndex = i;
            }
        }
        System.out.println(max + " index: " + firstIndex);

        int min = Integer.MAX_VALUE;
//        int min = nu`1mbers.get(0);
        int lastIndex = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= min) {
                min = numbers.get(i);
                lastIndex = i;
            }
        }
        System.out.println(min + " index: " + lastIndex);
    }
}
