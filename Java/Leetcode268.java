class Leetcode268 {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != i + 1) {
                if(nums[i] == 0) {
                    break;
                }
                nums = swap(nums, i, nums[i]-1);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0){
                return j+1;
            }
        }
        return 0;
    }

    public int[] swap(int[] num, int index, int newIndex) {
        int temp = num[index];
        num[index] = num[newIndex];
        num[newIndex] = temp;

        return num;
    }
}
