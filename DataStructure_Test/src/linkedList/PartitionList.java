package linkedList;

public class PartitionList {
	
	private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public PartitionList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x) {
        if (head == null || head.next == null) {
            return;
        }

        Node lowDummy = new Node(0); // Low list dummy head
        Node highDummy = new Node(0); // High list dummy head
        Node low = lowDummy;
        Node high = highDummy;

        Node temp = head;
        while (temp != null) {
            if (temp.value < x) {
                low.next = temp;
                low = temp;
            } else {
                high.next = temp;
                high = temp;
            }
            temp = temp.next;
        }

        high.next = null; // Terminate high list
        low.next = highDummy.next; // Connect low list to high list

        head = lowDummy.next; // Update head to the new list's head
        
         lowDummy.next = null;
        highDummy.next = null;
    }
}




