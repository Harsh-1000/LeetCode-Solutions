class Solution {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp,1);
        int j;
        for(int i=2;i<n+1;i++) {
            j=3;
            while(j>-1) {
                dp[j] = dp[j]+dp[j+1];
                j--;
            }
        }
        int count = 0;
        for(int i=0;i<5;i++)
            count += dp[i];
        return count;
    }
}