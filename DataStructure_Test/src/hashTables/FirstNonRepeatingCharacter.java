package hashTables;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chArr = str.toCharArray();

        // 문자 등장 횟수 기록
        for (char ch : chArr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 첫 번째로 중복되지 않은 문자 찾기
        for (char ch : chArr) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
         * EXPECTED OUTPUT: ---------------- l h null
         * 
         */

    }

}
