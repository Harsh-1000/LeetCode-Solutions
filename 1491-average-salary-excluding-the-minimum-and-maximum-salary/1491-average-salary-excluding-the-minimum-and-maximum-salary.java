class Solution {
    public double average(int[] salary) {
        
        int min=salary[0];
        int max=salary[0];
        
        double sum=0;
        
        for(int i: salary )
        {
            if(i>max)
                max=i;
            
            if(i<min)
                min=i;
            
            sum+=i;
        }
        
        sum=sum-(max+min);    
        
        int k = salary.length-2;
        
        return sum/k;
    }
}