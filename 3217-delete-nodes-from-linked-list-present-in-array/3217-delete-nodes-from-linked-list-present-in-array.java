/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
        class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        // Store nums in HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Remove nodes from beginning if needed
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }
        
        // If all nodes removed
        if (head == null) return null;
        
        ListNode current = head;
        
        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next;  // skip node
            } else {
                current = current.next;  // move forward
            }
        }
        
        return head;
    }
}
    