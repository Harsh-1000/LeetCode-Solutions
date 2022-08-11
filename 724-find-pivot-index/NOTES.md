for(int i=0;i<nums.length;i++)
{
int sl=0, sr=0;
for(int j=0;j<i;j++)
sl+=nums[j];
for(int j=i+1;j<nums.length;j++)
sr+=nums[j];
if(sr==sl)
{
return i;
}
}
-------------------------------------------------------------
public int pivotIndex(int[] nums)
{
if(nums.length==0)
return 0;
int sl = 0;
int sr = 0;
int total=0;
for(int i=0;i<nums.length;i++)
{
total+=nums[i];
}
for(int i=0;i<nums.length;i++)
{
sr = total - nums[i] - sl;
if(sr==sl)
return i;
sl += nums[i];
}
return -1;
}