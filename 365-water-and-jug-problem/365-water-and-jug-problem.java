class Solution {
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity<targetCapacity)
        {
            return false;
        }
        if(jug1Capacity==targetCapacity || jug2Capacity==targetCapacity || jug1Capacity+jug2Capacity==targetCapacity)
        {
            return true;
            
        }
        return targetCapacity%gcd(jug1Capacity,jug2Capacity) == 0;
    }
}