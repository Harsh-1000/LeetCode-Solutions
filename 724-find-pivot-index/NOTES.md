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