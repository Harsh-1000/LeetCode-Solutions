class Solution {
    public int countGoodSubstrings(String s) {
         int i = 2, count = 0;
        while(i < s.length())
        {
            char last = s.charAt(i), middle = s.charAt(i-1), first = s.charAt(i-2);
            count += (last != middle && middle != first && first != last) ? 1 : 0;
            i++;
        }
        return count;
    }
}