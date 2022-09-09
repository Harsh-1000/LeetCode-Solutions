class Solution {
    
    private void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int mid = 0;
        int low = 0;
        
        int high = nums.length-1;
        
        
        while(mid<=high && nums.length>1)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            
           else if(nums[mid]==1)
            {
                mid++;
            }
            
            else
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
                
    }
}