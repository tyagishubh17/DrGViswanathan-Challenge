class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode removal = new ListNode(0);
        removal.next = head;
        ListNode prev = removal;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }        
        return removal.next;
    }
}