public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseList(ListNode head) {

        // Iterative
        // ListNode current = head;
        // ListNode previous = null;

        // while (current != null) {
        //     ListNode tmp = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = tmp;
        // }

        // return previous;

        // Recursive
        if (head == null || head.next == null) return head;
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.mext = null;
        return prev;
    }

}