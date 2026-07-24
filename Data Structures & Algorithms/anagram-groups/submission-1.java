class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(int i = 0 ;i< strs.length; i++){
            String key = findKey(strs[i]);
            List<String> stl = anagram.getOrDefault(key, new ArrayList<>());
            stl.add(strs[i]);
            anagram.put(key, stl);
        }
        return new ArrayList<>(anagram.values());
    }

    public String findKey(String st){
        int[] pos = new int[26];
        for(int i = 0 ;i < st.length(); i++){
            pos[st.charAt(i) - 'a']++;
        }
        String key = "";
        for(int i = 0 ;i < 26; i++){
            if(pos[i] != 0){
                String temp = "c" + i + "p" + pos[i];
                key = key + temp;
            }
            
        }
        return key;
    }
}
