class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        
        if (nums.length == 1) return 0;
        
        if (nums[0] >= len-1) return 1;
        
        int idx = 0;
        
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = Integer.MAX_VALUE;
        arr[0] = 1;
        for (int i=0; i < len-1; i++) {
            for (int j = i+1; j < len && j <= i + nums[i]; j++) {
                arr[j] = Math.min(arr[j], arr[i]+1);
            }
        }
        
        return arr[len-1]-1;
    }
}