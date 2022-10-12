class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        int i= nums.length-1;
        int j= nums.length-2;
        int k= nums.length-3;
       
        while(k>=0)
        {
            int a = nums[i];
            int b = nums[j];
            int c = nums[k];
        
            if(a+b>c && b+c>a && c+a>b)
                return a+b+c;
            
            i--;
            j--;
            k--;
        }
        
        return 0;
        
        
        
    }
}