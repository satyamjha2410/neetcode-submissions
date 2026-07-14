class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String st: strs){
            String sizePrefix = st.length() + "#";
            ans = ans + sizePrefix + st ;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        int i = 0 ;
        while(i < str.length()){
           String number = "";
           while(str.charAt(i) != '#'){
             number = number + str.charAt(i);
             i++;
           }
           Integer size = Integer.valueOf(number);
           lst.add(str.substring(i+1 , i + size+1));
           i = i + size + 1 ;
        }
        return lst;
    }

    
}
