package blind75;

public class IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        root1.left = n1;
        root1.right = n2;

        TreeNode root2 = new TreeNode(1);
        TreeNode m1 = new TreeNode(5);
        TreeNode m2 = new TreeNode(3);
        root2.left = m1;
        root2.right = m2;

        System.out.println(isSameTree(root1,root2));
    }
}
