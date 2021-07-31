// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int start=0,end=nums.length-1;
        int [] res=new int[]{-1,-1};
        if(nums.length==0)
            return res;
        
        while(start<end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>=target)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }  
        if(nums[start]!=target)
            return res;
        res[0]=start;
        end=nums.length-1;
        
        while(start<end)
        {
            int mid=(start+end+1)/2;
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid;
            }
        }
        res[1]=start;
        
        return res;
        
        
    }
}