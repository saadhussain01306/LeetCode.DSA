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
    public int pairSum(ListNode head) {
        //find the middle of the linked list
        if(head==null){
            return 0;
        }
        int max=0;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=reverse(slow.next);
        // reverse the remaining half of the list
        ListNode start=head;

        while(slow.next!=null){
            // start comparing the start abd reversed string
            max=Math.max(start.val+slow.next.val,max);
            start=start.next;
            slow=slow.next;
        }

        return max;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=head;

        while(next!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
    }
}
