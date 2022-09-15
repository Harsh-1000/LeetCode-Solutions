for(int i=1;i<max+1;i++)
{
if(fre[i]==0)
continue;
if(i*2 > max || fre[i]>fre[i*2])
return new int[0];
fre[i*2] -= fre[i];
while(fre[i]-- > 0)
res[k++] = i;
}
return res;
}
}
```