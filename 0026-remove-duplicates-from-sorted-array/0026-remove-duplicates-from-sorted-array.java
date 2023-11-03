class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int cnt = 0;
        for (int num: nums) {
            if (list.contains(num)) continue;

            list.add(num);
            cnt++;
        }
        
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
            System.out.println(nums[i]);
        }

        return list.size();
    }
}