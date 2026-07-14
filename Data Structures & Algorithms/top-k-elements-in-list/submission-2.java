class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        int maxf = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < len ;i++){
           int val = mp.getOrDefault(nums[i], 0 ) + 1;
           mp.put(nums[i], val);
           maxf = Math.max(maxf,val);
        }
        Map<Integer, List<Integer>> rmp = new HashMap<>();
    
        for(var entry: mp.entrySet()){
           List<Integer> list = rmp.getOrDefault(entry.getValue(), new ArrayList<>());
           list.add(entry.getKey());
           rmp.put(entry.getValue(),list);
        }
        List<Integer> answer = new ArrayList<>();
        int it = maxf;
        while (k > 0) {
            if (rmp.containsKey(it)) {
                for (int num : rmp.get(it)) {
                    if (k == 0) break;
                    answer.add(num);
                    k--;
                }
            }
            it--;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
