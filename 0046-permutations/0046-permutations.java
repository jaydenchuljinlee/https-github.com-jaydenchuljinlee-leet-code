class Solution {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        backTracking(nums, new LinkedList<>(), nums.length);
        
        return result;
    }
    
    public void backTracking(int[] nums, LinkedList<Integer> list, int len) {
        if (len == 0) {
            result.add(list);
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) continue;
            
            list.add(nums[i]);
            backTracking(nums,(LinkedList<Integer>) list.clone(), len-1);
            list.remove(list.size()-1);
        }
    }
}