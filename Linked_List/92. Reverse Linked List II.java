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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null){
           return null;
       } 
       //create a dummy node
       ListNode dummy=new ListNode(-1);
       dummy.next=head;
       ListNode left_pre=dummy;
       ListNode cur=head;

       for(int i=0;i<left-1;i++){
           left_pre=left_pre.next;
           cur=cur.next;
       }

       // now cur is the node that we start reversal from
       // left_pre is at the node that is left to the cur node we need to update its next after reversal of node
       //store the current node because we need to update its next to the node that are after the right position
        
       ListNode secure_cur=cur;
       
       //perform reversal

       ListNode prev=null;
       ListNode next=null;
       for(int i=0;i<=right-left;i++){
          next=cur.next;
          cur.next=prev;
          prev=cur;
          cur=next;
       }
      // left prev to the prev
       left_pre.next=prev;

       // secure_cur to the current pointer node
       secure_cur.next=cur;

       return dummy.next;
    }
}
