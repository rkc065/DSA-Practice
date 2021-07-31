// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        int counter=6;
        int val,index;
        
        while(counter>0)
        {
            val=0;
            while(n>0)
            {
                index=n%10;
                val+=index*index;
                n=n/10;
            }
            if(val==1)
                return true;
            n=val;
            counter-=1;
        }
        return false;
    }
}