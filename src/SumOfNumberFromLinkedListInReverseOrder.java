public class SumOfNumberFromLinkedListInReverseOrder {

    void sum(){
//        ListNode a1 = new ListNode(9);
//
//
//        ListNode b1 = new ListNode(1);
//        ListNode b2 = new ListNode(9);
//        ListNode b3 = new ListNode(9);
//        ListNode b4 = new ListNode(9);
//        ListNode b5 = new ListNode(9);
//        ListNode b6 = new ListNode(9);
//        ListNode b7 = new ListNode(9);
//        ListNode b8 = new ListNode(9);
//        ListNode b9 = new ListNode(9);
//        ListNode b10 = new ListNode(9);
//        b1.next = b2;
//        b2.next = b3;
//        b3.next = b4;
//        b4.next = b5;
//        b5.next = b6;
//        b6.next = b7;
//        b7.next = b8;
//        b8.next = b9;
//        b9.next = b10;
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(9);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(9);
        ListNode a7 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;



        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        ListNode b3 = new ListNode(9);
        ListNode b4 = new ListNode(9);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;

        addTwoNumbers(a1,b1);
    }

     // Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           int carry = 0;
           ListNode result = new ListNode();
           ListNode temp = result;
           while(l1 != null || l2 != null){
               int sum = 0;
               if(l1 == null){
                   sum = l2.val + carry;
                   l2 = l2.next;
               }else if(l2 == null){
                   sum = l1.val + carry;
                   l1 = l1.next;
               }
               else{
                   sum = l1.val + l2.val + carry;
                   l1 = l1.next;
                   l2 = l2.next;
               }
               if(sum >=0){
                   ListNode next = new ListNode();
                   temp.next = next;
                   next.val = sum%10;
                   carry = sum/10;
                   temp = next;
               }

           }
           if(carry!=0){
               ListNode next = new ListNode(carry);
               temp.next = next;
           }
           return result.next;

        }

}
