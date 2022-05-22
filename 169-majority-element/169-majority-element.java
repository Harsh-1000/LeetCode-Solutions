class Solution {
    public int majorityElement(int[] nums) {
        
    
        int res=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        
        for(Map.Entry ele: map.entrySet())
        {
            int key = (Integer)ele.getKey();
            
            int times = (int)ele.getValue();
          
            if(times>Math.floor(nums.length/2))
            {
                res=key;
                break;
            }
        }
        
        return res;
        
        
        
    }
}