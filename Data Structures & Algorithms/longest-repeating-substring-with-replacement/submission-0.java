class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 ;
        int[] count = new int[26];
        char[] sc = s.toCharArray();
        int maxCount = 0 ;
        int maxFreq = 0 ;
        for(int i = 0 ;i < s.length() ; i++){
            int pos = sc[i] - 'A';
            count[pos]++;
            maxFreq = Math.max(maxFreq, count[pos]);
            if(i- l + 1 - maxFreq <= k){
                maxCount = Math.max(maxCount, i- l + 1);
            }
            else{
                count[sc[l] - 'A']--;
                l++;
            }
        }
        return maxCount;
    }
}
