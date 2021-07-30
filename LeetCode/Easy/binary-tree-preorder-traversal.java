// https://leetcode.com/problems/binary-tree-preorder-traversal

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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> res= new ArrayList<Integer>();
        findPreorder(root,res);
        return res;
    }
    private void findPreorder(TreeNode root,ArrayList<Integer> res)
    {
        if(root==null)
            return ;
        res.add(root.val);
        if(root.left!=null)
            findPreorder(root.left,res);
        if(root.right!=null)
            findPreorder(root.right,res);
        
        
    }
}