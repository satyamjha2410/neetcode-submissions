class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int t = 0 ; t < nums.length; t++){
            if(t > 0 && nums[t] == nums[t-1]){
              continue;
            }
            int target = -1 * nums[t];
            int l = t+1;
            int r = nums.length -1;
            while(l<r){
                if(nums[l] + nums[r] < target  ){
                    l++;
                    continue;
                }
                if(nums[l] + nums[r] > target ){
                    r--;
                    continue;
                }
                ans.add(new ArrayList<>(List.of(nums[l] ,nums[r] ,nums[t])));
                l++;
                while(l<r && nums[l] == nums[l-1]){
                  l++;
                }
                
            }
        }
        return ans;
    }
}
