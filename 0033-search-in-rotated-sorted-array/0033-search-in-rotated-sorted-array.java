class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            
            return -1;
        }
        
        int mid = nums.length / 2;
        
        int pivot = -1;
        
        for (int i = 0; i < mid; i++) {
            if (nums[i] > nums[(nums.length-1)-i]) {
                pivot = (nums.length-1)-i;
                continue;
            }
            
            if (pivot == -1) break;
        }
        
        if (nums.length % 2 == 0 && pivot != -1 && nums[pivot-1] < nums[pivot]) pivot--;
        
        if (pivot != -1) {
            if (target >= nums[0]) {
                for (int i = 0; i < pivot; i++) {
                    if (nums[i] == target) return i;
                }
            }

            for (int i = pivot; i < nums.length; i++) {
                if (nums[i] == target) return i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        
        return -1;
    }
}