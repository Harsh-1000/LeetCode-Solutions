Approach 1 (not optimized) time take 9ms
​
do empty string bana cur_word and last_word <br>
​
jab tak space nahi arha tab tak cur_word me Character appende kar te jao <br>
space ate hi last_word = cur_word <br>
and cur_word=""; <br>
​
and me check kar lo cur_word.length()==0 the print length of last_word <br>
else <br>
print cur_word ki length <br>
​
​
```
​
class Solution {
public int lengthOfLastWord(String s) {
StringBuffer cur_word = new StringBuffer("");
StringBuffer last_word = new StringBuffer("");
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
if(cur_word.length()!=0)
last_word=cur_word;
​
cur_word= new StringBuffer("");
}
else
cur_word.append(s.charAt(i));
}
if(cur_word.length()==0)
return last_word.length();
else
return cur_word.length();
}
}
```