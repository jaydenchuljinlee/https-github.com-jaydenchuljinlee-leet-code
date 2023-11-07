class Solution {
    public void nextPermutation(int[] nums) {
        int p1 = -1;
        int p2 = -1;
        
        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                p1 = i;
                break;
            }
        }
        
        if (p1 == -1) {
            reverse(nums, 0);
            return;
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] > nums[p1]) {
                p2 = i;
                break;
            }
        }
        
        swap(nums, p1, p2);
        
        reverse(nums, p1+1);
    }
    
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void reverse(int[] nums, int start) {
        int n = start;
        int m = nums.length-1;
        
        while(n < m) {
            swap(nums, n, m);
            
            n++;
            m--;
        }
    }
}