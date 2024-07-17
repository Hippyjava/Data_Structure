package big_O;

public class BinarySearch {

	public static void main(String[] args) {

		int[] sortedArray = { 1, 4, 7, 9, 10, 46, 79, 90, 99, 368, 769 };

		int result = BinarySearch1(sortedArray, 368, 0, sortedArray.length - 1);
		System.out.println(result);
	}

	static int BinarySearch1(int[] sortedArray, int key, int low, int high) {

		int mid;

		while (low <= high) {
			mid = (low + high) / 2;
			if (key == sortedArray[mid]) {
				return mid;
			} else if (key > sortedArray[mid]) {
				low = mid + 1;
			} else if (key < sortedArray[mid]) {
				high = mid - 1;
			}
		}
		return -1; // fail
	}
}