class Leetcode205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            if(!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i))) {
                charMap.put(s.charAt(i), t.charAt(i));
                continue;
            }else if(charMap.containsValue(t.charAt(i))) {
                for(Character ch : charMap.keySet()){
                    if(charMap.get(ch) == t.charAt(i) && ch != s.charAt(i)) {
                        return false;
                    }
                }
            }else if(charMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
