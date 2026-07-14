class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> rmp = new HashMap<>();
      int len = nums.length;
      for(int i = 0 ;i < len ;i++){
        int rem = target - nums[i];
        if(rmp.containsKey(rem)){
            int j = rmp.get(rem);
            if(i!=j){
                return new int[]{j,i};
            }
        }
        rmp.put(nums[i],i);
      }
      return new int[0];
    }
}
