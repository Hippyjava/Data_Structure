package mergeSort;

public class MergeTwoSortedListsExample {

    public static void main(String[] args) {
        MergeTwoSortedLists l1 = new MergeTwoSortedLists(1);
        l1.append(3);
        l1.append(8);
        l1.append(10);
        
        MergeTwoSortedLists l2 = new MergeTwoSortedLists(2);
        l2.append(5);
        l2.append(11);
        l2.append(13);
        
        l1.merge(l2);

        l1.printAll();

        
        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 1
            Tail: 8
            Length:8
            
            Linked List:
            1
            2
            3
            4
            5
            6
            7
            8

        */

    }

}
