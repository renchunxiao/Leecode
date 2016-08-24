/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
   插入排序，把之前head的node节点插入到新的排序dummy当中
   具体的插入就是pre代表插入之前的元素，cur代表当前被插入的元素。
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        
        ListNode pre = dummy;
        ListNode cur = head;
        
        while (cur != null) {
            ListNode next = cur.next;
            
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next; 
            }
            
            cur.next = pre.next;
            pre.next = cur;
            pre = dummy;
            cur = next;
        }
        
        
        return dummy.next;
    }
}
