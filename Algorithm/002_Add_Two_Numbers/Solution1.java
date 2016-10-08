/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pointer = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int n = l1.val + l2.val + carry;
            pointer.next = new ListNode(n % 10);
            carry = n / 10;
            l1 = l1.next;
            l2 = l2.next;
            pointer = pointer.next;
        }
        
        while (l1 != null) {
            int n = l1.val + carry;
            pointer.next = new ListNode(n % 10);
            carry = n / 10;
            l1 = l1.next;
            pointer = pointer.next;
        }
        
        while (l2 != null) {
            int n = l2.val + carry;
            pointer.next = new ListNode(n % 10);
            carry = n / 10;
            l2 = l2.next;
            pointer = pointer.next;
        }
        
        if (carry != 0) {
            pointer.next = new ListNode(carry);
        }
        
        return head.next;
    }
}
