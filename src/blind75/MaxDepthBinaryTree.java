package blind75;

public class MaxDepthBinaryTree {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode m1 = new TreeNode(9);
        TreeNode m2 = new TreeNode(20);
        TreeNode m3 = new TreeNode(15);
        TreeNode m4 = new TreeNode(7);
        root.left = m1;
        root.right = m2;
        m2.left = m3;
        m2.right = m4;
        System.out.println(maxDepth(root));
    }
}
