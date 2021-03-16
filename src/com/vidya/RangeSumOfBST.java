package com.vidya;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        System.out.println(rangeBSTSum(root,7,15));
    }

    static int rangeBSTSum(TreeNode root, int low, int high){
        int sum =0;

        if(root == null){
            return sum;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            TreeNode current = queue.poll();

            if(current.val >= low && current.val <= high){
                sum += current.val;
            }

            if(current.left !=null && current.val > low){
                queue.add(current.left);
            }

            if(current.right !=null && current.val < high){
                queue.add(current.right);
            }
        }
        return sum;
    }
}
