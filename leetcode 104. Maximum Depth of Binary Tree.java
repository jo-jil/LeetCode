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
    public int maxDepth(TreeNode root) {
        return max(root);
    }

    public static int max(TreeNode tree)
    {
        if(tree == null)
        {
            return 0;
        }
        else
        {
            int leftD = max(tree.left);
            int rightD = max(tree.right);
            if(leftD > rightD)
            {
                return leftD +1;
            }
            else
            {
                return rightD +1;
            }
        }
    }
}
