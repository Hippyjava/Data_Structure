package doublyLinkedList;

public class PalindromeCheckerExample {

	public static void main(String[] args) {
		 PalindromeChecker myDLL1 = new PalindromeChecker(1);
	        myDLL1.append(2);
	        myDLL1.append(3);
	        myDLL1.append(2);
	        myDLL1.append(1);
	        
	        System.out.println("myDLL1 isPalindrome:");
	        System.out.println( myDLL1.isPalindrome() );
	        
	        
	        
	        PalindromeChecker myDLL2 = new PalindromeChecker(1);
	        myDLL2.append(2);
	        myDLL2.append(3);
	        
	        System.out.println("\nmyDLL2 isPalindrome:");
	        System.out.println( myDLL2.isPalindrome() );

	}

}
