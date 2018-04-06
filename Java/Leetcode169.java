class Leetcode169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        int max = 0;
        int finalInt = nums[0];

        for(int i: nums) {
            if(!numCount.containsKey(i)) {
                numCount.put(i, 1);
                continue;
            }else {
                int currCount = numCount.get(i) + 1;
                if(currCount > max) {
                    max = currCount;
                    finalInt = i;
                }
                numCount.put(i, currCount);
            }
        }
        return finalInt;
    }
}
