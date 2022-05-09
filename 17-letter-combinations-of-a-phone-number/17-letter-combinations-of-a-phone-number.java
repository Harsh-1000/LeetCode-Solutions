class Solution {
public List letterCombinations(String digits) {

    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
      }};
    List<String> list = new ArrayList<>();
    
    if(digits.length() == 0) {
        return list;
    }
    StringBuilder sb = new StringBuilder();
    backtrack(sb, digits, list, map, 0);
    return list;
}

public void backtrack(StringBuilder sb, String digits, List<String> ls, Map<Character, String> map, int start) {
    if(sb.length() == digits.length()) {
        ls.add(sb.toString());
        return;
    }
    
    for(int i = start; i < digits.length(); i++) {
        String s = map.get(digits.charAt(i));
        for(int j = 0; j < s.length(); j++) {
            sb.append(s.charAt(j));
            backtrack(sb, digits, ls, map, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
}