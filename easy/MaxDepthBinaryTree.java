public class MaxDepthBinaryTree {

    /*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest 
path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its depth = 3.

    */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }
    
    public static int maxDepth(TreeNode root) {
        int maxDepthRight = 1;
        int maxDepthLeft = 1;

        if (root == null) return 0;

        if (root.left != null) {
            maxDepthLeft =  1 + maxDepth(root.left);
        }

        if (root.right != null)
            maxDepthRight = 1 + maxDepth(root.right);

        return maxDepthLeft > maxDepthRight ? maxDepthLeft : maxDepthRight;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.left = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
}