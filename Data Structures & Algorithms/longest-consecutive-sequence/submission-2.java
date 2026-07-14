class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int seq = 1 ;
        int max_seq = 1;
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0 ; i< nums.length-1; i++){
            if(nums[i+1] == nums[i]){
                continue;
            }
            if(nums[i+1] - nums[i] == 1){
                seq++;
                max_seq = Math.max(seq, max_seq);
            }
             if(nums[i+1] - nums[i] > 1){
                seq = 1;
            }
        }
        return max_seq;
    }
}
