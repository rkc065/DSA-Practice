// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
        
    int n=address.length();
    
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char curr=address.charAt(i);
            if(curr=='.')
              str.append("[.]");
            else 
                str.append(curr);
        }
         return str.toString();
    }
}