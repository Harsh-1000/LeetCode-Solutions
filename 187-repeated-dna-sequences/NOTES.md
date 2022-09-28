```
ArrayList<String> list = new ArrayList<>();
if(s.length()<10)
return list;
HashSet<String> set =  new HashSet<>();
int si=0;
int ei=0;
String str = new String();
while(ei<s.length())
{
str += s.charAt(ei);
if(ei-si+1==10)
{
if(!set.add(str))
{
if(!list.contains(str))
list.add(str);
}
si++;
str=s.substring(si,ei+1);
}
ei++;
}
return list;
}
```