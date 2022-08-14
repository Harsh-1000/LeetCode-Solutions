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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int a=0,b=0,sum=0;
        int carry=0;
        
        ListNode l3 = new ListNode(0);
        
        ListNode head =l3;
        
        while(l1!=null || l2!=null)
        {
            sum=0;
            
            if(l1!=null)
            {
                
               a=l1.val;
               l1=l1.next;
            }   
            
            else
                a=0;
            
            if(l2!=null)
            {
                
               b=l2.val;
               l2=l2.next;

            }   
            else
                b=0;
            
            sum = a + b + carry;
            
            carry = sum / 10;
            
            
            if(head==null)
                 head= new ListNode(sum%10);
            else
            {
                 head.next =  new ListNode(sum%10);
                 head = head.next;
            } 
            
            
                
        }
        
        if(carry>0)
        {
             head.next =  new ListNode(carry);
        }
        
        return l3.next;
    }
}
