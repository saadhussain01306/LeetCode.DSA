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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode current=head;
        ListNode next=null;

        while(current!=null){
            next=current.next;
            while(next!=null){
                if(current.val>next.val){
                    int temp=current.val;
                    current.val=next.val;
                    next.val=temp;
                }
                next=next.next;
            }

            current=current.next;
        }

        return head;

        
    }
}

-----------------------------------------------------------------------------------------------------

//time complexity is large for this

// applying merge sort

