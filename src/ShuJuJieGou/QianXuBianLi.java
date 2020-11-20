package ShuJuJieGou;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class QianXuBianLi {
    public static void main(String[] args) {
        System.out.println("a");
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {//前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return null;

        ArrayList<Integer> nums = new ArrayList<>();
        DG(root,nums);
        return nums;
    }
    public static void DG(TreeNode root, ArrayList<Integer> nums){
        if (root != null){
            nums.add(root.val);
            DG(root.left,nums);
            DG(root.right,nums);
        }
    }
}