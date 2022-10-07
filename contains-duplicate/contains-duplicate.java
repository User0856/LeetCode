class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            if (!set.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }
}