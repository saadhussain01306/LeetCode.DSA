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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        // har tortoise algo
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode sec_half = reverseList(slow);

        // Compare the first half with the reversed second half
        while (head != null && sec_half != null) {
            if (head.val != sec_half.val) {
                return false;
            }
            head = head.next;
            sec_half = sec_half.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
    }
}
