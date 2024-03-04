package blind75;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetricIterative {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode p=queue.poll(), q=queue.poll();

            if(p==null && q==null) continue;
            if((p==null || q==null) || (p.val!=q.val)) return false;

            queue.add(p.left); queue.add(q.right);
            queue.add(p.right); queue.add(q.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode m1 = new TreeNode(2);
        TreeNode m2 = new TreeNode(3);
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
