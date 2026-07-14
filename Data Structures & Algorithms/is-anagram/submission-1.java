class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character ,Integer> mp = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(var c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0) + 1);
        }

        for(var c : t.toCharArray()){
           if(mp.containsKey(c)){
             int newVal = mp.get(c) -1;
             if (newVal < 0){
                return false;
             }
             mp.put(c,mp.get(c) -1);
           }
           else return false;
        }

        return true;
    }
}
