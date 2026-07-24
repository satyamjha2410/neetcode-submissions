class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> vis = new HashSet<>();
        for(int i = 0 ; i < nums.length ;i++){
            if(vis.contains(nums[i])){
                return true;
            }
            vis.add(nums[i]);
        }
        return false;
    }
}