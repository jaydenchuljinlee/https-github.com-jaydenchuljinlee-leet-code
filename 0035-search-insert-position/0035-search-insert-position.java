class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;

        if (nums[len - 1] < target) return len;
        if (nums[0] > target) return 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == target) return i;
            
            if (nums[i] > target) return i;
        }

        return -1;
    }
}