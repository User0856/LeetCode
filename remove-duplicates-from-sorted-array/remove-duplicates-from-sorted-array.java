class Solution {
    public int removeDuplicates(int[] nums) {
        
        int uniqueCounter = 1;
        for(int i = 0; i < nums.length -1; i++)
        {   
            if (nums[i] != nums[i+1])
            {
               
                nums[uniqueCounter] = nums[i+1];
                uniqueCounter++;
            }
               
        }

        return uniqueCounter;
    }
}