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
    public ListNode deleteMiddle(ListNode head) {
        // Base cases: empty list or a list with only one node
        if(head == null || head.next == null) {
            return null;
        }

        // Initialize two pointers: fast and slow
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev_slow = null; // To keep track of the node before the middle node

        // Move fast and slow pointers until fast reaches the end of the list
        while(fast != null && fast.next != null) {
            prev_slow = slow; // Update prev_slow before moving slow
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node by updating the next pointer of the node before the middle node
        prev_slow.next = prev_slow.next.next;

        // Return the modified head of the linked list
        return head;
    }
}
