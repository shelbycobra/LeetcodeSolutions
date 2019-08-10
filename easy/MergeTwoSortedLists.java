public class MergeTwoSortedLists {

    /*Merge two sorted linked lists and return it as a new list. 
    The new list should be made by splicing together the nodes of the first two lists. 

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
    
    */

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode mergedList = null;
        ListNode head = null;

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            // start at l1 head
            head = l1;
            mergedList = l1;
            l1 = l1.next;
        }
        else {
            head = l2;
            // start at l2 head.
            mergedList = l2;
            l2 = l2.next;
        }

        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                mergedList.next = l1;
                if (mergedList.next != null)
                    mergedList =  mergedList.next;
                l1 = l1.next;
            }
            else {
                mergedList.next = l2;
                if (mergedList.next != null)
                    mergedList =  mergedList.next;
                l2 = l2.next;
            }
        }

        if (l1 != null)
            mergedList.next = l1;
        else if (l2 != null)
            mergedList.next = l2;

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);

        ListNode n = mergeTwoLists(l1, l2);

        while(n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}