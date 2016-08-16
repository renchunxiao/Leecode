/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        //首先根据快慢指针找到中位node
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //然后反转中位node后面的链表
        ListNode after = reverse(slow.next);
        
        //从中位后面的节点一直走到null，每步判断是否相同
        while (after != null) {
            if (head.val != after.val) return false;
            after = after.next;
            head = head.next;
        }
        
        return true;
    }
    
    
    private ListNode reverse(ListNode head) {
       ListNode pre = null;
       while(head != null) {
           ListNode tmp = head.next;
           head.next = pre;
           pre = head;
           head = tmp;
       }
       return pre;
    }
    
}
