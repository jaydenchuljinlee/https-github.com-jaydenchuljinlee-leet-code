class Solution {
    int[] numbers;
    List<List<Integer>> result = new ArrayList<>();
    HashSet<String> set = new HashSet<>();
    int len;
    public List<List<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        numbers = nums.clone();
        
        if (len < 1) return result;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i == i-1) continue;
            
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(nums[i]));
            
            int[] visited = new int[len];
            visited[i] = 1;
            
            permutations(1, sb, visited.clone());
            visited[i] = 0;
        };
        
        int sign = 1;
        
        for (String str: set) {
            List<Integer> list = new ArrayList<>();
            // System.out.println(str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {
                    sign = -1;
                    continue;
                }
                int item = str.charAt(i) - '0';
                // System.out.print(item);
                // System.out.print(", ");
                list.add(item*sign);
                sign = 1;
            }
            result.add(list);
        }
        
        return result;
    }
    
    public void permutations(int cnt , StringBuilder list, int[] visited) {
        if (len == cnt) {
            if (set.contains(list.toString())) return;
            
            set.add(list.toString());
            return;
        }
        
        for (int i = 0; i < len; i++) {
            if (visited[i] == 1) continue;
            
            visited[i] = 1;
            
            list.append(Integer.toString(numbers[i]));
            permutations(cnt+1, list, visited.clone());
            if (numbers[i] < 0) {
                list.deleteCharAt(list.length() - 1);
            }
                list.deleteCharAt(list.length() - 1);
            
            visited[i] = 0;
        }
    };
}