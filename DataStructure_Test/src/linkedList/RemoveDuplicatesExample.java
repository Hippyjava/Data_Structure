package linkedList;

public class RemoveDuplicatesExample {

	public static void main(String[] args) {
		
		RemoveDuplicates myLinkedList = new RemoveDuplicates(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4
            
        */
        
    }

}
