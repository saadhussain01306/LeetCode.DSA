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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head==null){
             return null;
         }

         ListNode dummy= new ListNode(-1);
         dummy.next=head;
         ListNode first=dummy;
         ListNode sec=dummy;

         for(int i=0;i<n;i++){
             sec=sec.next;
         }

         while(sec.next!=null){
             first=first.next;
             sec=sec.next;
         }

         first.next=first.next.next;

         return dummy.next;
    }
}
