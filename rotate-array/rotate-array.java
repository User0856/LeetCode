class Solution {
    public void rotate(int[] nums, int k) {
        while(k > nums.length){
            k = k - nums.length;
        }
        
        int[] tail = new int[k];
        for(int i = k, j = 0; i > 0; i--, j++){
            tail[j] = nums[nums.length - i];
        }
        
        
        for(int i=nums.length-k, j=1; i > 0; i--, j++){
            nums[nums.length - j] = nums[i-1];
        }
 
        
        for(int i = 0; i < tail.length; i++){
            nums[i] = tail[i];
        }
    }
}