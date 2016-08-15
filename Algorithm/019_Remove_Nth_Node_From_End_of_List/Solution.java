/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode begin = head;
        ListNode end = head;
        
        for (int i = 0; i < n; i++) {
            if (end == null) {
                return begin;
            }
            end = end.next;   
        }
        
        if (end == null) {
            return begin.next;
        }
        
        while (end.next != null) {
            begin = begin.next;
            end = end.next;
        }
        
        begin.next = begin.next.next;
        
        return head;
    }
}
