class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode head = null;
        ListNode node = null;
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        } 
        if (l2 == null){
            return l1;
        }
        while(l1 != null && l2 != null) {
            
            if(l1.val < l2.val) {
                node = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l1.val > l2.val) {
                node = new ListNode(l2.val);
                l2=l2.next;
            }
            else if(l1.val == l2.val) {
                node = new ListNode(l1.val);
            }
            if(current == null) {
                current = node;
                head = current;
            } else {
                current.next = node;
                current = node;
            }
            
        }
        while(l1 != null) {
            node = new ListNode(l1.val);
            l1 = l1.next;
            current.next = node;
            current = node;
        }
        while(l2 != null) {
            node = new ListNode(l2.val);
            l2 = l2.next;
            current.next = node;
            current = node;
        }
        
        return head;
    }
}