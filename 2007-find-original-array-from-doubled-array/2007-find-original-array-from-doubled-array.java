class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n == 0 || n % 2 != 0) return new int[]{};
        int max = Integer.MIN_VALUE;
        for(int num : changed){
            max = Math.max(max, num);
        }
        int[] bucket = new int[max + 1];
        for(int num : changed){
            bucket[num]++;
        }
        if(bucket[0] > 0 && bucket[0] % 2 != 0) return new int[]{};
        int[] ans = new int[n/2];
        int i = 0;
        for(int j = 0; j <= max; j++){
            if(i >= n/2) break;
            if(bucket[j] > 0){
                if(j * 2 > max || bucket[j * 2] == 0) return new int[]{};
                else{
                    bucket[j]--;
                    bucket[j*2]--;
                    ans[i] = j;
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}