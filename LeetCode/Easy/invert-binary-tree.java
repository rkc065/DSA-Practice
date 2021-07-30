// https://leetcode.com/problems/invert-binary-tree

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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null)
            return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.right=left;
        root.left=right;
        return root;
        
    }
//     public void swap(TreeNode curr)
//     {
//         swap(curr.left);
//         swap(curr.right);
//         TreeNode temp=curr.left;
//         curr.left=curr.right;
//         curr.right=temp;

//     }
}