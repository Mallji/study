package leetcode.seq.AddTwoNumbers;

public class LinkedListOperations {

    // Method to add an element to the end of the linked list
    public static ListNode addElement(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            // If the linked list is empty, the new node becomes the head
            return newNode;
        } else {
            // Traverse to the end of the linked list and add the new node
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
    }

    // Method to delete an element from the linked list
    public static ListNode deleteElement(ListNode head, int val) {
        if (head == null) {
            // If the linked list is empty, nothing to delete
            return null;
        }

        // If the element to be deleted is the head
        if (head.val == val) {
            return head.next;
        }

        // Traverse the linked list to find the element to be deleted
        ListNode current = head;
        while (current.next != null && current.next.val != val) {
            current = current.next;
        }

        // If the element is found, skip it in the linked list
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // Method to print the elements of the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example Usage
        ListNode head = null;

        // Adding elements to the linked list
        head = addElement(head, 1);
        head = addElement(head, 2);
        head = addElement(head, 3);

        System.out.println("Linked List after adding elements:");
        printList(head);

        // Deleting an element from the linked list
        head = deleteElement(head, 2);

        System.out.println("Linked List after deleting element 2:");
        printList(head);
    }
}
