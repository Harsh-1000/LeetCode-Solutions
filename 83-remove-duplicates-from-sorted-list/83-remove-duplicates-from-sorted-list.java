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
    public ListNode deleteDuplicates(ListNode head) {
        
        
        if(head==null)
            return null;
        
        ListNode temp =head;
          ListNode map =head;
        
        while(map!=null){
        while( temp!=null && map.val==temp.val)
        {
            temp=temp.next;
        }
        
        map.next=temp;
            map=map.next;
            
        }    
        
        return head;
        
    }
}