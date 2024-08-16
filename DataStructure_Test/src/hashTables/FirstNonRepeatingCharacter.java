package hashTables;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chArr = str.toCharArray();

        // ���� ���� Ƚ�� ���
        for (char ch : chArr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // ù ��°�� �ߺ����� ���� ���� ã��
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
