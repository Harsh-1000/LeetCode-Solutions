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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] spiral = new int[m][n];
    
        int minr=0;
        int maxr=m-1;
        int minc=0;
        int maxc=n-1;

        
        for(int[] i: spiral)
            Arrays.fill(i,-1);
        
        while(head!=null)
        {
            
            for(int i=minc;i<=maxc && head!=null;i++)
            {
                     spiral[minr][i] = head.val; 
                     head = head.next;
            }
            
            minr++;
            
            for(int i=minr;i<=maxr && head!=null;i++)
            {
                     spiral[i][maxc] = head.val;  
                     head = head.next;
            }
            
            maxc--;
            
            for(int i=maxc;i>=minc && head!=null;i--)
            {
               
                     spiral[maxr][i] = head.val;  
                     head = head.next;        
            }
            
            maxr--;
            
            for(int i=maxr;i>=minr && head!=null;i--)
            {
                     spiral[i][minc] = head.val; 
                     head = head.next;
            
                    
            }
            
            minc++;
            
        }
        
        
        return spiral;
        
        
    }
}