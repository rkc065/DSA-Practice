// https://leetcode.com/problems/fibonacci-number

class Solution {
    public int fib(int n) {
     int x=0,y=1,z;
        if(n==0)
            return x;
        else if(n==1)
            return y;

        for(int i=2;i<=n;i++)
        {
           z=x+y;
            x=y;
            y=z;
        }
        return y;
    }
}