package blind75;

public class SymmetricTreeRecursive {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        return p.val==q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode m1 = new TreeNode(2);
        TreeNode m2 = new TreeNode(2);
        TreeNode m3 = new TreeNode(3);
        TreeNode m4 = new TreeNode(4);
        TreeNode m5 = new TreeNode(4);
        TreeNode m6 = new TreeNode(3);
        root.left = m1;
        root.right = m2;
        m1.left = m3;
        m1.right = m4;
        m2.left = m5;
        m2.right = m6;

        System.out.println(isSymmetric(root));

    }
}
