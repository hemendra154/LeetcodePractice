public class BalancedBinaryTree110 {
    int maxDepth = 0;

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
        t3.left = t4;
        t3.right = t5;

        System.out.println(isBalanced(t1));
    }

    public boolean isBalanced(TreeNode root) {
        return findHeight(root) != -1;
    }

    public int findHeight(TreeNode root){
        if(root == null)
            return 0;

        int leftHeight = findHeight(root.left);
        if(leftHeight == -1) return -1;

        int rightHeight = findHeight(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight) > 1)
            return -1;

        return Math.abs(leftHeight-rightHeight);
    }
}
