import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Question7 {
    // 记录下中序遍历数组每个值对应的索引，可以快速定位到那个值
    private HashMap<Integer, Integer> indexForInOrders = new HashMap<>();

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++) {
            indexForInOrders.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length-1, 0);
    }

    public void preTraversal(TreeNode root) {
        if (root == null)
            return;
        preTraversal(root.left);
        preTraversal(root.right);
        System.out.println(root.val);
    }
}

public class Solution7 {
    public static void main(String[] args){
        int[] pre = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Question7 q7 = new Question7();
        TreeNode root = q7.reConstructBinaryTree(pre, inorder);
        q7.preTraversal(root);
    }
}
