package stackAndQueue;

public class SortStack {
    public static void sortStack(Stack2<Integer> stack) {
        Stack2<Integer> temp = new Stack2<>();
        
        while(!stack.isEmpty()) {
            int tempNum = stack.pop();
            while(!temp.isEmpty() && temp.peek() > tempNum) {
                stack.push(temp.pop());
            }
            temp.push(tempNum);
        }
        
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack2<Integer> stack = new Stack2<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
         * EXPECTED OUTPUT: ---------------- Before sorting: 2 4 1 3
         * 
         * After sorting: 1 2 3 4
         * 
         */

    }
}
