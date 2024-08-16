package doublyLinkedList;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}

		public String toString() {
			return value + "";
		}
	}

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void append(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		Node removed = tail;

		if (length == 0) {
			return null;
		} else if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = removed.prev;
			tail.next = null;
			removed.prev = null;
		}
		length--;
		return removed;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		Node removed = head;

		if (length == 0) {
			return null;
		} else if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			removed.next = null;
		}
		length--;
		return removed;
	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			return false;
		} else if (index == length) {
			append(value);
			return true;
		} else if (index == 0) {
			prepend(value);
			return true;
		} else {
			Node newNode = new Node(value);
			Node before = get(index - 1);
			Node target = before.next;

			newNode.prev = before;
			newNode.next = target;
			before.next = newNode;
			target.prev = newNode;

			length++;

			return true;
		}
	}

	public Node remove(int index) {

		if (index < 0 || index >= length) {
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == length - 1) {
			return removeLast();
		} else {
			Node removed = get(index);
			removed.prev.next = removed.next;
			removed.next.prev = removed.prev;
			removed.next = null;
			removed.prev = null;

			length--;
			
			return removed;
		}
	}

	public Node get(int index) {
		int mid = length / 2;
		Node target = head;

		if (index < 0 || index >= length) {
			return null;
		}

		if (index < mid) {
			for (int i = 0; i < index; i++) {
				target = target.next;
			}
		} else {
			target = tail;
			for (int i = length - 1; i > index; i--) {
				target = target.prev;
			}
		}
		return target;
	}

	public boolean set(int index, int value) {
		Node target = get(index);

		if (target != null) {
			target.value = value;
			return true;
		}
		return false;
	}
	
}