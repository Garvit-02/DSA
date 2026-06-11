class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {

            // Duplicate sequence found
            if (head.next != null && head.val == head.next.val) {

                int duplicateVal = head.val;

                while (head != null && head.val == duplicateVal) {
                    head = head.next;
                }

                prev.next = head;
            } 
            else {
                prev = prev.next;
                head = head.next;
            }
        }

        return dummy.next;
    }
}
