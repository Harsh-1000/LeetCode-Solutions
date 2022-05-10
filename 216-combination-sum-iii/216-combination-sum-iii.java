class Solution {
    List<List<Integer>> ans;
    List<Integer> current;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        current = new ArrayList<>();
        helper(1, 9, k, n);
        return ans;
    }
    public void helper(int start, int end, int k, int target){
        if(target == 0 && current.size() == k){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i <= end; i++){
            current.add(i);
            helper(i + 1, end, k, target - i);
            current.remove(current.size() - 1);
        }
    }
}