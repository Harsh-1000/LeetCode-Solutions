class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         
         HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
            
         for(int i=0;i<nums1.length;i++)
             set1.add(nums1[i]);
        
         for(int i=0;i<nums2.length;i++)
             set2.add(nums2[i]);
        
        List<Integer> list = new ArrayList<>();
        
        for(int x: set1)
        {
            if(!set2.add(x))
                list.add(x);
        }
        
        int[] res = new int[list.size()];
        
        int i=0;
        for(int x: list)
        {
            res[i] =x;
            i++;
        }
        
        return res;
    }
}