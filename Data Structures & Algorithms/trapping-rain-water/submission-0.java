class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        int left_max = 0;
        int right_max = 0;
        for(int i = 0 ;i< n ;i++){
          left[i] = left_max;
          right[n - 1 - i] = right_max;
          left_max = Math.max(left_max, height[i]);
          right_max = Math.max(right_max, height[n-1-i]);
        }
        int area = 0;
        for(int i = 0; i< n ;i++){
          int block_area = Math.min(left[i], right[i]) - height[i];
          area = area + ( block_area > 0 ? block_area: 0);
        }
        return area;
    }
}
