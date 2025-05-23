
class ListNode {
    int val;
    ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode newHead = new ListNode(-5001);
        ListNode curNode = head;
        while(curNode != null){
            ListNode nextNode = curNode.next; //원본 연결 유지

            // 새로운 리스트에서 위치 찾기
            ListNode prev = newHead;
            while (prev.next != null && prev.next.val < curNode.val) {
                prev = prev.next;
            }

            // curNode 삽입
            curNode.next = prev.next;
            prev.next = curNode;

            // 다음 노드로 이동
            curNode = nextNode;
        }

        return newHead.next;

    }

}
