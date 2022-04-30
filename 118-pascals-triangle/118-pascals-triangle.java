class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> list = new ArrayList<>();
        
        if(numRows==0)
            return list;
        
        list.add(new ArrayList<>());
        list.get(0).add(1);
        
        
        if(numRows==1)
        {
            return list;
        }
        
       
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        
         
        if(numRows==2)
        {
            return list;
        }
                
        
        for(int i=2;i<numRows;i++)
        {
            
            ArrayList<Integer> l = new ArrayList<>();
            
            l.add(1);
            
            for(int j=0;j<list.get(i-1).size()-1;j++)
            {
                l.add(list.get(i-1).get(j) + list.get(i-1).get(j+1));
            }
            
            l.add(1);
                
            list.add(l);
        }
        
        return list;
            
        
    }
}