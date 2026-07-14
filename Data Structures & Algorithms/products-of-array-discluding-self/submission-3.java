class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        boolean containsZero = false;
        int freqOfZero = 0;
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] == 0){
                containsZero = true;
                freqOfZero++;
                if(freqOfZero > 1){
                    product = 0;
                    break;
                }
                continue;
            }
            product = product * nums[i];
        }
        if(freqOfZero == 1){
            for(int i = 0 ;i< nums.length ;i++){
                if(nums[i]!=0){
                    nums[i] = 0;
                }
                else{
                    nums[i] = product;
                }
            }
            return nums;
        }
        
        for(int i = 0 ;i< nums.length ;i++){
            if(nums[i] == 0){
                nums[i] = product;
            }
            else{
                nums[i] = product/nums[i];
            }
            
        }
        return nums;
    }
}  
