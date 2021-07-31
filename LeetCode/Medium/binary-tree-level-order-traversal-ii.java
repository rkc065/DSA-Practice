// https://leetcode.com/problems/binary-tree-level-order-traversal-ii

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=1;
        while(q.isEmpty()==false)
        {
            List<Integer> L =new ArrayList<>();
            int num=0;
            while(count-- > 0)
            {
                TreeNode t=q.poll();
                if(t.left!=null)
                {
                    q.add(t.left);
                    num++;
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                    num++;
                }
                L.add(t.val);
            }
            count=num;
            res.add(0,L);
        }
        return res;
    }
}