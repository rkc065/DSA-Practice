// https://leetcode.com/problems/combination-sum

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      Arrays.sort(candidates); 
        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 1; i <= target; i++) { 
            List<List<Integer>> newList = new ArrayList();
          
            for (int j = 0; j < candidates.length && candidates[j] <= i; j++) {
        
                if (i == candidates[j]) newList.add(Arrays.asList(candidates[j]));
            
                else for (List<Integer> l : dp.get(i-candidates[j]-1)) {
                    if (candidates[j] <= l.get(0)) {
                        List cl = new ArrayList<>();
                        cl.add(candidates[j]); cl.addAll(l);
                        newList.add(cl);
                    }
                }
            }
            dp.add(newList);
        }
        return dp.get(target-1);
    }
}