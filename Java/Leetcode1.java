import java.util.Hashtable;

class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> compliments = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(compliments.containsKey(nums[i])) {
                return new int[] {compliments.get(nums[i]), i};
            }else {
                compliments.put(compliment, i);
            }
        }
        return null;
    }

}
