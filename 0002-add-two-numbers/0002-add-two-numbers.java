/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        
        while (l1 != null || l2 != null || remainder != 0) {
            int val1 = 0;
            int val2 = 0;

            if (l1 != null) {
                val1 =  l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val; 
                l2 = l2.next;
            }

            int sum = val1 + val2 + remainder;
            remainder = sum / 10;

            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
        }
        
        return result.next;
    }
}