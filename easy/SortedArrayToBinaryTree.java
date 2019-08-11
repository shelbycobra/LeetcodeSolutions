import java.lang.Math;

public class SortedArrayToBinaryTree {
    /*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a
binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5


    */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = addNode(nums, 0, nums.length - 1);
        return root;
    }

    private static TreeNode addNode(int[] nums, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = addNode(nums, start, mid - 1);
        node.right = addNode(nums, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[] {-10,-7,-5,-3,0,1,2,5,9}));
    }
}