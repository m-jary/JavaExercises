package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HashMaps {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 321, 411, 53, 6, 6645,1,1,1,2,3,4,2,1,2,3,
                5));
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (Integer randomNumber : randomNumbers) {
            if (!map.containsKey(randomNumber)) {
                map.put(randomNumber, 1);
            } else {
                map.put(randomNumber, map.get(randomNumber) + 1);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (Integer i : keys) {
            for (int j = 0; j < map.get(i); j++) {
                System.out.print(i + ", ");
            }
        }
    }
}
