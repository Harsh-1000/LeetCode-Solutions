Approach 1: Using HashMap
​
```
HashMap<Integer,Integer> map = new HashMap<>();
int n = (int) Math.floor(nums.length/2);
for(int i=0;i<nums.length;i++)
{
map.put(nums[i],map.getOrDefault(nums[i],0)+1);
}
for(int x: map.keySet())
{
if(map.get(x)>n)
return x;
}
return -1;
```