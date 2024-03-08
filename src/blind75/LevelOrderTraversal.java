package blind75;

import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> values = new ArrayList<>();
            int size = queue.size();

            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                values.add(node.val);

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(0, values);
        }
        return result;
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
        System.out.println(levelOrderBottom(root));
    }
}
