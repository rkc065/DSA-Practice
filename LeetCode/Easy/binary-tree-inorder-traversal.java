// https://leetcode.com/problems/binary-tree-inorder-traversal

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
    ArrayList<Integer> res=new ArrayList<Integer>();
        
        findinorder(root,res);
        return res;
    }
        private void findinorder(TreeNode root,ArrayList<Integer> res)
        {
            if(root==null)
                return;
            if(root.left!=null)
                findinorder(root.left,res);
            res.add(root.val);
            if(root.right!=null)
                findinorder(root.right,res);
            
        
    }
}