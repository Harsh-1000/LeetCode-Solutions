class Solution {
    public void nextPermutation(int[] nums) {
        
        int indx1 = -1;
        int indx2 = -1;
        
        int n = nums.length;
        
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                indx1 = i;
                break;
            }
                
        }
        
        if(indx1==-1)
            Arrays.sort(nums);
        
        else
        {
             for(int i=n-1;i>=0;i--)
              {
                if(nums[indx1]<nums[i])
                    {
                        indx2 = i;
                        break;
                    }
                
              }
        
                // swap nums[indx1] & nums[indx2]
        
                 int temp = nums[indx1];
                 nums[indx1] = nums[indx2];
                 nums[indx2] = temp;
        
                 Arrays.sort(nums,indx1+1,n);
            
        }
        
       
    }
}