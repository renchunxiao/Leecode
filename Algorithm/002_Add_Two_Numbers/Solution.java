/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        int carry = 0;
        boolean returnTmp1 = false;
        while (l1 != null && l2 != null) {
            int n = l1.val + l2.val + carry;
            if (n >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            l1.val = n % 10;
            l2.val = n % 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            returnTmp1 = true;
            if (carry != 0) {
                int tmp = l1.val + carry;
                l1.val = tmp % 10;
                if (tmp >= 10) {
                    carry = 1;
                    if (l1.next == null) {
                        l1.next = new ListNode(carry);
                        carry = 0;
                        break;
                    } else {
                        l1 = l1.next;
                    }
                } else {
                    carry = 0;
                    break;
                }
            } else {
                break;
            }
        }
        while (l2 != null) {
            returnTmp1 = false;
            if (carry != 0) {
                int tmp = l2.val + carry;
                l2.val = tmp % 10;
                if (tmp >= 10) {
                    carry = 1;
                    if (l2.next == null) {
                        l2.next = new ListNode(carry);
                        carry = 0;
                        break;
                    } else {
                        l2 = l2.next;
                    }
                } else {
                    carry = 0;
                    break;
                }
            } else {
                break;
            }
        }
        
        if (carry > 0) {
            ListNode c = tmp1;
            while (true) {
                if (c.next == null) {
                    c.next = new ListNode(carry);
                    break;
                } else {
                    c = c.next;
                }
            }
            return tmp1;
        }

        
        if (returnTmp1) {
            return tmp1;
        } else {
            return tmp2;
        }
    
        
    }
}
