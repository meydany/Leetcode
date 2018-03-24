class Leetcode42 {
    public String countAndSay(int n) {
        String num = "1";
        for(int i = 1; i < n; i++) {
            num = getNext(num);
        }
        return num;
    }

    public String getNext(String n) {;
        String num = "";
        int count = 1;

        for(int i = 1; i < n.length(); i++) {
            if(n.charAt(i) == n.charAt(i-1)) {
                count++;
            }else {
                num += (count + "" + n.charAt(i-1));
                count = 1;
            }
        }

        num += (count + "" + n.charAt(n.length()-1));

        return num;
    }
}
