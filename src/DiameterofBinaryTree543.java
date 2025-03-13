public class DiameterofBinaryTree543 {
    int maxDepthLeft = 0;
    int maxDepthRight = 0;

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

        System.out.println(diameterOfBinaryTree(t1));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        depthLeft(root.left,1);
        depthRight(root.right,1);

        int path =maxDepthLeft + maxDepthRight;
        return path;
    }

    void depthLeft (TreeNode root, int depth){
        if(root == null)
            return;
        maxDepthLeft = Math.max(maxDepthLeft, depth);
        if(root.left != null){
            depthLeft(root.left, depth+1);
        }
        if(root.right != null){
            depthLeft(root.right, depth+1);
        }
    }

    void depthRight (TreeNode root, int depth){
        if(root == null)
            return;
        maxDepthRight = Math.max(maxDepthRight, depth);
        if(root.left != null){
            depthRight(root.left, depth+1);
        }
        if(root.right != null){
            depthRight(root.right, depth+1);
        }
    }
}
