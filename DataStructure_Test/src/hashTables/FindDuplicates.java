package hashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }

        for (int i : arr) {
            if (map.get(i) == true && !list.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 2, 1, 4, 5, 4 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
         * EXPECTED OUTPUT: ---------------- [1, 2, 4]
         * 
         */

    }

}
