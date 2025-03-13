public class SameTree100 {

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

    void print(){
        TreeNode t1 = new TreeNode(3, null, null);
        TreeNode t2 = new TreeNode(9, null, null);
        TreeNode t3 = new TreeNode(20, null, null);
        TreeNode t4 = new TreeNode(15, null, null);
        TreeNode t5 = new TreeNode(7, null, null);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        System.out.println(isSameTree(t1,t1));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(q.right,q.right);
    }
}
