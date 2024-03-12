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
    public ListNode removeZeroSumSublists(ListNode head) {
       if(head==null){
           return null;
       } 
       ListNode dummy=new ListNode(-1);
       dummy.next=head;

       ListNode cur=dummy;

       while(cur!=null && cur.next!=null){
           ListNode temp=cur.next;
           int sum=0;
           while(temp!=null){
               sum+=temp.val;
               if(sum==0){
                  cur.next=temp.next;
               }
              temp=temp.next;
           }
           cur=cur.next;
       }

       return dummy.next;
    }
}
