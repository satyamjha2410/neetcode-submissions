class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> pos = new HashMap<>();
        var sc = s.toCharArray();
        int l = 0;
        int maxl = 0;
        for(int i = 0 ; i< len ;i++){
          if(pos.containsKey(sc[i])){
            l =  Math.max(l, pos.get(sc[i]) + 1 );
          }
          int cl = i - l + 1;           
          maxl = Math.max(maxl, cl);
          pos.put(sc[i], i);
          
        }
        return maxl;
    }
}
