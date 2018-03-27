class Leetcode9 {
    public boolean isPalindrome(int x) {
        if(x < 0 || x%10==0 && x != 0) return false;

        int original = x;
        int reverse = 0;
        while(x >= 1) {
            reverse = (reverse * 10) + x%10;
            x /= 10;
        }
        return reverse == original;
    }
}
