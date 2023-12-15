package leetcode.seq.AddTwoNumbers;

import static leetcode.seq.AddTwoNumbers.LinkedListOperations.*;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        // Example Usage
        ListNode l1 = null;
        ListNode l2 = null;

        // Adding elements to the linked list
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);
        l1 = addElement(l1, 9);

        l2 = addElement(l2, 9);
        l2 = addElement(l2, 9);
        l2 = addElement(l2, 9);
        l2 = addElement(l2, 9);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        printList(listNode);


//            System.out.println("Linked List after adding elements:");
//            printList(head);
//
//            // Deleting an element from the linked list
//            head = deleteElement(head, 2);
//
//            System.out.println("Linked List after deleting element 2:");
//            printList(head);
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



