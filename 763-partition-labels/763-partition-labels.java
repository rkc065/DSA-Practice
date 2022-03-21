class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result=new ArrayList<>();
        int n=s.length();
        if(s==null || s.length()==0)
            return null;
        int [] last_indices=new int [26];
        for(int i=0;i<n;i++)
        {
            last_indices[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
           end=Math.max(end,last_indices[s.charAt(i)-'a']);
            if(i==end)
            {
                System.out.println(end);
                result.add(end-start+1);
                 start=end+1;
                
            }
           
        }
        return result;
    }
}