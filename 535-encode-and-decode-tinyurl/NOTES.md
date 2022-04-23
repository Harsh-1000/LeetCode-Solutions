{
s=generator();
}
while(map.containsKey(s));
String str="http:// " + s;
​
map.put(str,longUrl);
return str;
}
​
// Decodes a shortened URL to its original URL.
public String decode(String shortUrl) {
return map.get(shortUrl);
}
}
​
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
​