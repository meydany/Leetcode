class Leetcode7 {
    public int reverse(int x) {

        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;

        boolean negative = false;
        if(x < 0) {
            x *= -1;
            negative = true;
        }

        long current = x % 10;
        x /= 10;

        while(x >= 1) {
            current = current * 10 + (x % 10);
            x /= 10;
        }

        if(current >= Integer.MAX_VALUE || current <= Integer.MIN_VALUE) return 0;
        int finalNum = Integer.parseInt(current + "");
        return negative ? -finalNum : finalNum;
    }
}
