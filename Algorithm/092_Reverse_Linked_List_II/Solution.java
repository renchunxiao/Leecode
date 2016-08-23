/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        int index = 1;
        while (index < m) {
            pre = pre.next;
            index++;
        }
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        while (index < n) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
            index++;
        }
        
        return dummy.next;
    }
}
