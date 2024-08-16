package doublyLinkedList;

public class SwapNodesInPairs {

	private Node head;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public SwapNodesInPairs(int value) {
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
		StringBuilder output = new StringBuilder();
		Node temp = head;
		while (temp != null) {
			output.append(temp.value);
			if (temp.next != null) {
				output.append(" <-> ");
			}
			temp = temp.next;
		}
		System.out.println(output.toString());
	}

	public void makeEmpty() {
		head = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
		length++;
	}

	public void swapPairs() {
		if (length <= 1) return; // If the list is empty or has only  
			
		Node current = head;
		Node newHead = head.next; // New head will be the second node of the list

		while (current != null && current.next != null) {
			Node first = current;
			Node second = current.next;

			// Change pointers between first and second
			first.next = second.next;
			second.prev = first.prev;

			if (second.next != null) {
				second.next.prev = first;
			}

			if (first.prev != null) {
				first.prev.next = second;
			}
			first.prev = second;
			second.next = first;

			// Move to the next pair
			current = first.next;

		}

		head = newHead;
	}

}
