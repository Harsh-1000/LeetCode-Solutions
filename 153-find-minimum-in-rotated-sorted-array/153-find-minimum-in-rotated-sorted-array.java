class Solution {
    public int findMin(int[] nums) {
        
        int low  = 0;
        int high = nums.length-1;
        int n=nums.length;
        
        while(low<high)
        {
            if(nums[low]<=nums[high])
                return nums[low];
            
            int mid = low + (high-low)/2;
            int next = (mid+1)%n;
            int pre = (mid + n -1)%n;
            
           
            
            if(nums[mid]<=nums[next] && nums[mid]<=nums[pre])
                return nums[mid];
            
            if(nums[mid]<=nums[high])
                high = mid - 1;
            
            if(nums[mid]>=nums[low])
                low = mid + 1;
        }
        
        return nums[low];
    }
}