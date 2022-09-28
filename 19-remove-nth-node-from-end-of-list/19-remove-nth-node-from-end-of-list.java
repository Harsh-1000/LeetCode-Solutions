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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        
        ListNode temp = head;
        
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        
        if(len==1)
            return null;
        
        n = len - n;
    
        
       temp = head;
        
        if(n!=0)
        {
            while(n>1)
            {
                temp=temp.next;
                n--;
            }
            
        
            temp.next = temp.next.next;
            
        }
        else
        {
            head = temp.next;
        }
            
        
           
        return head;
    
    }
}
