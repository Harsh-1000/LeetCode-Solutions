class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int even=0;
        int odd=nums.length-1;
        
        while(even<odd)
        {
            if(nums[even]%2==0)
                even++;
            
            else
            { 
                int temp = nums[odd];
                nums[odd]=nums[even];
                nums[even]=temp;
                
                odd--;
            }
                
        }
        
        return nums;
        
    }
}