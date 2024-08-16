package stackAndQueue;

public class ReverseString {
    
    public static String reverseString(String str) {
        Stack2<Character> list = new Stack2<>();
        StringBuilder sb = new StringBuilder();
        
        for(char ch : str.toCharArray()) {
            list.push(ch);
        }
        
        while(!list.isEmpty()) {
            sb.append(list.pop());
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

    }

}
