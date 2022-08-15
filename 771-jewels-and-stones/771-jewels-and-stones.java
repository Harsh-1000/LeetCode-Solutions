class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        
        int c=0;
        int sum=0;
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<jewels.length();i++)
            set.add(jewels.charAt(i));
        
        while(c<stones.length())
        {
            if(set.contains(stones.charAt(c)))
                sum++;
            
            c++;
        }
        
        return sum;
        
        
        
    }
}