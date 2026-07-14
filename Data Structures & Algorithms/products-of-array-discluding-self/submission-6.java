class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] ans = new int[len];

        int p = 1;
        int s = 1;
        prefix[0] = 1;
        suffix[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            p = p * nums[i - 1];
            s = s * nums[len - i];
            prefix[i] = p;
            suffix[len - i - 1] = s;
        }
        for (int i = 0; i < len; i++) {
           ans[i] =  prefix[i] * suffix[i];
        }
        return ans;
    }
}
