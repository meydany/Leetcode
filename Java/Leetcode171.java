class Leetcode171 {
    public int titleToNumber(String s) {
        if(s.length() == 1) {
            return Character.getNumericValue(s.charAt(0))-9;
        }else {
            return (int) Math.pow(26, s.length()-1) * (Character.getNumericValue(s.charAt(0))-9) + titleToNumber(s.substring(1));
        }
    }
}
