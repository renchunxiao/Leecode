/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alength = 0;
        int blength = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        
        while (tmpA != null) {
            alength++;
            tmpA = tmpA.next;
        }
        while (tmpB != null) {
            blength++;
            tmpB = tmpB.next;
        }
        tmpA = headA;
        tmpB = headB;
        
        if (alength > blength) {
            for (int i = 0; i < (alength - blength); i++) {
                tmpA = tmpA.next;
            }    
        } else {
            for (int i = 0; i < (blength - alength); i++) {
                tmpB = tmpB.next;
            }
        }
        
        while (tmpA != null) {
            if (tmpA == tmpB) return tmpA;
            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }
        
        return null;
    }
}
