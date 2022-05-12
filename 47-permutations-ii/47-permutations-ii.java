class Solution {
	//keeps the final result
    List<List<Integer>> result;
    public List<List<Integer>> permuteUnique(int[] nums) {
        result=new ArrayList<>();
		//backtracking function
        helper(0,nums);
        return result;
    }
    
    private void helper(int strt,int[] nums){
		//if all elements have been traversed
        if(strt==nums.length){
            List<Integer> ll=new ArrayList<>();
			//creating list from the array nums
            for(int i=0;i<nums.length;i++){
                ll.add(nums[i]);
            }
			//if ll is already present in the result, then there is no need to add this list item
            if(!result.contains(ll)){
                result.add(ll);
            }
            return;
        }
		//swapping the element at the strt index with every other element of the array which is present to the right of the strt element
		//this produces all permutations
        for(int i=strt;i<nums.length;i++){
            swap(strt,i,nums);
            helper(strt+1,nums);
			//swapping the elements back for further permutations
            swap(strt,i,nums);    
        }
        
    }
    
	//swap function
    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}