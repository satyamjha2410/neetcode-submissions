class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < len ;i++){
           mp.put(nums[i],i);
        }
        for(int i = 0 ; i < len ;i++){
           int temp = target - nums[i];
           if(mp.containsKey(temp)){
            int index = mp.get(temp);
            if(i != index){
               return new int[]{i,index};
            }          
           }
        }
        return null;
    }
}
