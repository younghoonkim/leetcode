

public class NodeRemoveN {

    /**
     * Definition for singly-linked list.
     * */
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || (n==1 && fast.next == null)) return null;

        for(int i = 1; i <=n; i++){
            fast = fast.next;
        }
        if(fast == null) return head = head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
