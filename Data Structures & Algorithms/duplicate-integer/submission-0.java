class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int len = nums.length;
        for(int i = 0 ;i< len ;i++){
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
        }
        return false;
    }
}