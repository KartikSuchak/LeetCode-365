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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode ptr = head;
        int m = 1;

        while(ptr.next != null){
            ptr = ptr.next;
            m++;
        }

        k = k % m;
        if(k == 0){
            return head;
        }

        ptr.next = head;

        int steps = m - k;
        ListNode temp = head;

        for(int i = 1; i < steps; i++){
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
