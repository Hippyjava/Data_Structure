package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
    
    public static List<int[]> findPairs(int[] iArr1, int[] iArr2, int target){
        Set<Integer> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        
        for(int num : iArr1) {
            set.add(num);
        }
        
        for(int num : iArr2) {
            int complement = target - num;
            if(set.contains(complement)) {
                list.add(new int[] {complement, num});
            }
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */

    }

}
