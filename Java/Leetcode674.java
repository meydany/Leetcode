class Leetcode674 {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        int prev = Integer.MIN_VALUE;

        for(int i : nums) {
            if(i > prev) {
                count++;
            }else {
                max = Math.max(max, count);
                count = 1;
            }
            prev = i;
        }

        return Math.max(max, count);
    }
}
