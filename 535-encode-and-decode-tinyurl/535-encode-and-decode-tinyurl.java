public class Codec {

    // Encodes a URL to a shortened URL.
    
    Map<String,String> map = new HashMap<>();
    
    
    private String generator()
    {
        

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        
        StringBuilder sb = new StringBuilder(7);
  
        for (int i = 0; i < 7; i++) {
  
          
            int index = (int)(AlphaNumericString.length()* Math.random());
  
           
            sb.append(AlphaNumericString .charAt(index));
        }
  
        return sb.toString();
    }
    
    
    
    public String encode(String longUrl) {
        
        String s;
        do
            
        {
            
            s=generator();
            
            
        }
        while(map.containsKey(s));
        
        String str="http:// " + s;

            
        map.put(str,longUrl);
        
        return str;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return map.get(shortUrl);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));