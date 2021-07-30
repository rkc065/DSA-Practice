// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
        
    int fir=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
        
            }
            
        }
       return false;
    }
}