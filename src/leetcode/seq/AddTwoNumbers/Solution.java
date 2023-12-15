package leetcode.seq.AddTwoNumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode ptr = l1;
        ListNode ptr2 = l2;
        ListNode ptr3 = null;
        int carry = 0;

        while (ptr != null || ptr2 != null || carry != 0) {
            int ptr_val = (ptr != null) ? ptr.val : 0;
            int ptr2_val = (ptr2 != null) ? ptr2.val : 0;
            AdditionResult sum = toSum(ptr_val + carry, ptr2_val);

            carry = sum.carry;

            if (ptr3 == null) {
                result = new ListNode(sum.sum);
                ptr3 = result;
            } else {
                ptr3.next = new ListNode(sum.sum);
                ptr3 = ptr3.next;
            }

            if (ptr != null) ptr = ptr.next;
            if (ptr2 != null) ptr2 = ptr2.next;
        }

        return result;
    }

    private int getListLength(ListNode l1) {
        int len = 0;
        while (l1 != null) {
            len++;
            l1 = l1.next;
        }
        return len;
    }

    private AdditionResult toSum(int val, int val1) {
        int i = val + val1;
        int sum = i % 10;
        int carry = i / 10;
        return new AdditionResult(sum, carry);
    }

    private static class AdditionResult {
        private int sum;
        private int carry;

        public AdditionResult(int sum, int carry) {
            this.sum = sum;
            this.carry = carry;
        }
    }
}
