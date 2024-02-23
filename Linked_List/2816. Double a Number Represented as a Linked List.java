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
    public ListNode doubleIt(ListNode head) {
        if (head == null) {
            return null;
        }

        // Reverse the linked list
        ListNode reversedHead = reverseLinkedList(head);

        // Double the reversed linked list
        ListNode doubledHead = doubleList(reversedHead);

        // Reverse the doubly linked list again to get the final result
        return reverseLinkedList(doubledHead);   
    }

     private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    private ListNode doubleList(ListNode head) {
        ListNode current = head;
        int carry = 0;

        while (current != null) {
            int doubledValue = current.val * 2 + carry;
            current.val = doubledValue % 10;
            carry = doubledValue / 10;

            if (current.next == null && carry > 0) {
                // If we have a carry after processing the last node, create a new node
                current.next = new ListNode(carry);
                break;
            }

            current = current.next;
        }

        return head;
    }
}
