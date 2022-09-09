link 1 => https://www.youtube.com/watch?v=9pdkbqGwUhs
​
link 2 =>  https://www.youtube.com/watch?v=2C4CQ32961Y
​
​
Algorithm
<br>
Three pointers are used: low, mid, high.
• Low and mid pointers point at start and high pointer points at the end of the given array.
<br><br>
Cases:
1. if array [ mid ] = 0, then swap array [ mid ] with array [low] and increment both pointers once.<br>
​
2. if array [ mid ] = 1, then no swapping is required, just increment mid pointer once. <br>
​
3. if array [ mid ] = 2, then swap array [ mid ] with array [high] and decrement the high pointer once. <br>
​
```
class Solution {
private void swap(int[] nums,int i,int j)
{
int temp = nums[i];
nums[i] = nums[j];
nums[j] = temp;
}
public void sortColors(int[] nums) {
int mid = 0;
int low = 0;
int high = nums.length-1;
while(mid<high)
{
if(nums[mid]==2)
{