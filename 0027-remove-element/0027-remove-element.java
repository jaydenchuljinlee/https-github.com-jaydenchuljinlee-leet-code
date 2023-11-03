class Solution {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> q = new LinkedList<Integer>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;

            cnt++;
            q.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (q.isEmpty()) continue;
            int item = q.poll();

            nums[i] = item;
        }

        return cnt;
    }
}