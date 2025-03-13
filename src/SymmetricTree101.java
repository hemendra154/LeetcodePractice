import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymmetricTree101 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    void print() {
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t2 = new TreeNode(2, null, null);
        TreeNode t3 = new TreeNode(2, null, null);
        TreeNode t4 = new TreeNode(3, null, null);
        TreeNode t5 = new TreeNode(4, null, null);
        TreeNode t6 = new TreeNode(4, null, null);
        TreeNode t7 = new TreeNode(3, null, null);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        System.out.println(isSymmetric(t1));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return compare(root.left, root.right);
    }

    boolean compare(TreeNode t1, TreeNode t2) {
        if(t1== null && t2 == null){
            return true;
        }
        if ( (t1 == null || t2 == null )||
                t1.val != t2.val) {
            return false;
        }
        return compare(t1.left, t2.right) && compare(t1.right, t2.left);
    }

}
