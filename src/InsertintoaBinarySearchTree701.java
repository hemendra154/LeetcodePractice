public class InsertintoaBinarySearchTree701 {

    void print() {
        TreeNode t1 = new TreeNode(3, null, null);
        TreeNode t2 = new TreeNode(9, null, null);
        TreeNode t3 = new TreeNode(20, null, null);
        TreeNode t4 = new TreeNode(17, null, null);
        TreeNode t5 = new TreeNode(1, null, null);
        TreeNode t6 = new TreeNode(15, null, null);
        TreeNode t7 = new TreeNode(7, null, null);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;


        System.out.println(insertIntoBST(t1, 11));
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        putInRightPosition(root, val);

        return root;
    }
    void putInRightPosition(TreeNode root, int val){
        int currentRoot = root.val;
        if(currentRoot > val){
            if(root.left != null){
                putInRightPosition(root.left, val);
            }else{
                root.left = new TreeNode(val);
            }
        }else {
            if(root.right != null){
                putInRightPosition(root.right, val);
            }else{
                root.right = new TreeNode(val);
            }
        }
    }
}
