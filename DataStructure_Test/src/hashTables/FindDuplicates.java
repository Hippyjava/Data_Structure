package hashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : arr) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
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
