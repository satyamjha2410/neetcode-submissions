class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> mp = new HashMap<>();
        for(int i = 0; i< len ; i++){
          String sortedString =  sort(strs[i]);
          var list = mp.getOrDefault(sortedString, new ArrayList<>());
          list.add(strs[i]);
          mp.put(sortedString,list);

        //   if(mp.containsKey(sortedString)){
        //     mp.put(sortedString, mp.get(sortedString).add(strs[i]));
        //   }
        //   else{
        //     List<Integer> newList = new ArrayList<>();
        //     newList.add(strs[i]);
        //     mp.put(sortedString,newList );
        //   }
        }
        return mp.values().stream().toList();
    }

    private String sort(String st){
        var chAr = st.toCharArray();
        Arrays.sort(chAr);
        return new String(chAr);
    }

   
}
