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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode res = head;
        ListNode temp = head.next;
        int sum=0;
        
        while(temp!=null)
        {
            sum=0;
            
            while(temp.val!=0)
            {
                sum += temp.val;
                temp = temp.next;
            }
            
            res.next=temp;
            temp.val=sum;
            res=res.next;
            temp=temp.next;
        }
        
        return head.next;
        
    }
}