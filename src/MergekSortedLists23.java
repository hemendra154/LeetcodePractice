public class MergekSortedLists23 {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0 || lists[0] == null)
            return null;

        if(lists.length == 1)
            return lists[0];

        ListNode result = lists[0];
        ListNode second = lists[1];

        result = merge(result, second);

        for(int i = 2; i<lists.length;i++){
            second = lists[i];
            result = merge(result, second);
        }
        return result;
    }

    ListNode merge(ListNode n1, ListNode n2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(n1 != null && n2 != null){
            if(n1.val<=n2.val){
                current.next = n1;
                n1 = n1.next;
            }else{
                current.next = n2;
                n2 = n2.next;
            }
            current = current.next;
        }

        while(n1!=null){
            current.next = n1;
            n1 = n1.next;
            current = current.next;
        }

        while(n2!=null){
            current.next = n2;
            n2 = n2.next;
            current = current.next;
        }

        return dummy.next;
    }


}
