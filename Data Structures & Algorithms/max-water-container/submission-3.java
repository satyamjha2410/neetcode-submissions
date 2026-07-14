class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max_area = 0;
        while(l < r){
          int ar =  area(heights, l,r);
          max_area = Math.max(max_area, ar);
          if(heights[l] < heights[r]){
            l++;
            continue;
          }
          if(heights[r] < heights[l] ){
            r--;
            continue;
          }
          else{
            l++;
            r--;
          }
        }
        return max_area;
    }

    private int area(int[] heights, int l, int r){
      return Math.min(heights[l],heights[r]) * (r-l);
    }
}
