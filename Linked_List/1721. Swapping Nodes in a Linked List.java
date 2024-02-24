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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return null;
        }

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;

        for(int i=0;i<k;i++){
            second=second.next;
        }
        ListNode temp=second;// we got the first next kth node from the beginning

        while(second.next!=null){
            first=first.next;
            second=second.next;
        }
        //first has arrived at the next before the actual node kth node to be swapped at the ending

        int temp1=first.next.val;
        first.next.val=temp.val;
        temp.val=temp1;

        return dummy.next;
    }
}
