class Solution {
    public ListNode reverseList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse remaining list
        ListNode newHead = reverseList(head.next);

        // Put current node after the next node
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
