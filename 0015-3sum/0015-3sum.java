class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> list = new LinkedList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high) {
                if (nums[low] + nums[high] == -nums[i]) {
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    // System.out.printf("%s, %s, %s", nums[i], nums[low], nums[high]);
                    // System.out.println();
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                    continue;
                }
                if (nums[low] + nums[high] < -nums[i]) {
                    low++;
                    continue;
                }
                if (nums[low] + nums[high] > -nums[i]) {
                    high--;
                    continue;
                }
                
            }
        };
        
        return list;
    }
}