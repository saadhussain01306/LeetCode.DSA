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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
          }

        ListNode dummy=new ListNode(0);
        ListNode current=head;

        while(current!=null){
            ListNode next=current.next;
            insert_at_pos(dummy,current);
            current=next;
        }
      
      return dummy.next;

    }

    private void insert_at_pos(ListNode dummy,ListNode node){
        ListNode current=dummy;

        while(current.next!=null && current.next.val<node.val){
            current=current.next;//move this many numbers to get the proper position
        }

        node.next=current.next;
        current.next=node;
    }
}
