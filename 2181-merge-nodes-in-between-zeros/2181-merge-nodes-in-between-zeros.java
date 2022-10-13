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
        
        ListNode res = new ListNode();
        ListNode temp =res;
        int sum=0;
        head = head.next;
        while(head!=null)
        {
            sum += head.val;
            
            if(head.val==0)
            {
                temp.next = new ListNode(sum); 
                temp=temp.next;
                sum=0;
            }
            
            head=head.next;
        }
        
        return res.next;
        
    }
}