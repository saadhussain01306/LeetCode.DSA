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
    public ListNode reverseList(ListNode head) {
        // Check if the linked list is empty
        if(head == null){
            return null;
        }

        // Initialize three pointers: prev, cur, and next
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        // Traverse the linked list and reverse the pointers
        while(cur != null){
            next = cur.next;   // Save the next node
            cur.next = prev;    // Reverse the link
            prev = cur;         // Move prev to current node
            cur = next;         // Move cur to the next node
        }

        // The 'prev' pointer is now pointing to the new head of the reversed list
        return prev;
    }
}
