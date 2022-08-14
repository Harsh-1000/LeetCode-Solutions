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
    
    private static void store(Queue s,ListNode l)
    {
        while(l!=null)
        {
            s.add(l.val);
            l=l.next;
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
         Queue<Integer> num1 = new LinkedList<>();
          Queue<Integer> num2 = new LinkedList<>();
        
        Queue<Integer> res = new LinkedList<>();
        
        store(num1,l1);
        store(num2,l2);
        
        int carry=0;
        
        int a=0;
        int b=0;
        
        while( !(num1.isEmpty()) || !(num2.isEmpty()) )
        {
            if(!(num1.isEmpty()))
                  a = num1.poll();
            else a=0;
            
             if(!(num2.isEmpty()))
                  b = num2.poll();
            else b=0;
            
           
            int sum=0;
            
            if(carry>0)
            {
                 sum=a+b+carry;   
            }
            else
            {
                 sum=a+b;
            }
            
            if(sum>=10)
            {
                res.add(sum%10);
                carry=sum/10; 
              
            }
            else
            {
                res.add(sum);
                carry=0;
            }
            
        }
        
        if(carry>0)
        {
            res.add(carry);
        }
        
    
        
        ListNode l3 = new ListNode(res.poll());
        
        ListNode head=l3;
        
        
        while(!res.isEmpty())
        {
            ListNode temp = new ListNode(res.poll());
            
            head.next=temp;
            head=head.next;
        }
            
        
        return l3;
        
        
        
    }
}