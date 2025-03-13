public class RotateList61 {

    void print(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        rotateRight(l1, 2);

    }

     class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        if(len == k){
            return head;
        }else if(k > len){
            k =  k % len;
        }

        if(k == 0)
            return head;


        ListNode curr1 = head;
        ListNode prev1 = null;
        while(curr1 != null){
            ListNode next = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next;
        }

        int i = 0;
        ListNode curr2 = prev1;
        ListNode prev2 = null;
        ListNode backup = null;
        while(curr2 != null && i< k){
            if(i++ == k-1)
                backup = curr2.next;
            ListNode next = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = next;
        }

        head = prev2;

        ListNode curr3 = backup;
        ListNode prev3 = null;
        while(curr3 != null){
            ListNode next = curr3.next;
            curr3.next = prev3;
            prev3 = curr3;
            curr3 = next;
        }
        prev1.next = prev3;

        return head;

    }
}
