public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
           if(llist==null){
               return;
           }
           reversePrint(llist.next);
           
           System.out.println(llist.data);

    }
