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
    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null)
            return head;

        ListNode smallGroupHead = null;
        ListNode smallGroupTail = smallGroupHead;

        ListNode bigGroupHead = null;
        ListNode bigGroupTail = bigGroupHead;

        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            
            if (head.val >= x) {
                if (bigGroupHead == null) {
                    bigGroupHead = newNode;
                    bigGroupTail = newNode;
                } else {
                    bigGroupTail.next = newNode;
                    bigGroupTail = newNode;
                }
            } else {
                if (smallGroupHead == null) {
                    smallGroupHead = newNode;
                    smallGroupTail = newNode;
                } else {
                    smallGroupTail.next = newNode;
                    smallGroupTail = newNode;
                }
            }

            head = head.next;
        }
        
        if (smallGroupTail != null) {
            smallGroupTail.next = bigGroupHead;
            return smallGroupHead;
        }
        
        return bigGroupHead;
    }
}