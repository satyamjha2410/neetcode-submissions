class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> vis = new HashMap<>();
        for (int i : nums) {
            vis.put(i, false);
        }
        if(nums.length == 0){
            return 0;
        }
        int max_len = 1;
        for (int i = 0; i < nums.length; i++) {
            if(vis.get(nums[i])){
                continue;
            }
            int node = nums[i];
            int pos_len = 1;
            int neg_len = 1;
            while (true) {
                node = node + 1;
                if (vis.containsKey(node)) {
                    pos_len++;
                    vis.put(node, true);
                }
                else{
                    break;
                }
            }
            node = nums[i];
            while (true) {
                node = node - 1;
                if (vis.containsKey(node)) {
                    neg_len++;
                    vis.put(node, true);
                }
                else{
                    break;
                }
            }
            max_len = Math.max(max_len,(pos_len + neg_len -1));
        }
        return max_len;
    }
}
