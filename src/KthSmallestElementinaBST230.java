import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementinaBST230 {

    void print() {
        TreeNode t1 = new TreeNode(3, null, null);
        TreeNode t2 = new TreeNode(1, null, null);
        TreeNode t3 = new TreeNode(20, null, null);
        TreeNode t4 = new TreeNode(9, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        TreeNode t6 = new TreeNode(17, null, null);
        TreeNode t7 = new TreeNode(15, null, null);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t4.left = t5;
        t4.right = t6;
        t6.left = t7;


        System.out.println(kthSmallest(t1, 11));
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inOrder = new ArrayList<>();

        inOrder(root, inOrder);
        return inOrder.get(k-1);
    }

    void inOrder(TreeNode root, List<Integer> inOrder){
        if(root == null)
            return;
        inOrder(root.left, inOrder);
        inOrder.add(root.val);
        inOrder(root.right, inOrder);

    }

}
