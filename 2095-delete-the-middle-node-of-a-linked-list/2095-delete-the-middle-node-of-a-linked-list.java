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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next==null)
            return null;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode temp=head;
        
        while(temp.next!=slow)
        {
            temp=temp.next;
        }
        
        temp.next=slow.next;
        
        return head;
    }
}