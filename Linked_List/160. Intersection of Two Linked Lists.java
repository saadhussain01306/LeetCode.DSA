/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        
        HashSet<ListNode> h=new HashSet<>();
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            h.add(temp1);
            temp1=temp1.next;
        }

        while(temp2!=null){
            if(h.contains(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }

        return null;
    }
}

-------------------------------------------------------------------------------------------------------

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=get_length(headA);
        int len2=get_length(headB);
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(len1>len2){
            temp1=temp1.next;
            len1--;
        }

        while(len2>len1){
            temp2=temp2.next;
            len2--;
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1;
    }

    private int get_length(ListNode temp){
        int count=0;
          while(temp!=null){
              count++;
              temp=temp.next;
          }
          return count;

    }
}
