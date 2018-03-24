class Leetcode5 {
    public String longestPalindrome(String s) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        int count = 0;
        String p = "";

        if(s.length() == 1 || s.length() == 0) return s;

        for(int i = s.length()-1; i >= 0; i--) {
            int startIndex = 0;
            char c = s.charAt(i);
            int index = s.indexOf(c, startIndex);
            while(index != i && index != -1) {
                int start = index;
                int end = i;
                int j = start;
                int k = end;

                int difference = (start - end) %2 == 0 ? 1 : 0;
                while(k - j >= difference && s.charAt(j) == s.charAt(k)) {
                    j++;
                    k--;
                }

                if(s.charAt(j) == s.charAt(k)) {
                    int newCount = end - start + 1;
                    if(newCount >= count) {
                        count = newCount;
                        p = s.substring(start, end + 1);
                    }else {
                        break;
                    }
                }
                index = s.indexOf(c, index + 1);
            }
        }
        if(count == 0) p = s.charAt(0) + "";
        return p;
    }
}
