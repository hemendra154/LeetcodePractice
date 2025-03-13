import java.util.*;

public class BinaryTreeRightSideView199 {

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

        System.out.println(rightSideView(t1));
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        List<List<Integer>> levelOrder = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        levelOrder(levelOrder, q);

        for(List<Integer> curentLevel : levelOrder){
                result.add(curentLevel.get(curentLevel.size()-1));
        }

        return result;
    }

    void levelOrder(List<List<Integer>> result, Queue<TreeNode> queue) {
        int levelSize = queue.size();
        List<Integer> currectLevel = new ArrayList<>();

        for(int i = 0;i<levelSize;i++){
            TreeNode currentNode = queue.poll();
            currectLevel.add(currentNode.val);

            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        result.add(currectLevel);
        if(!queue.isEmpty())
            levelOrder(result, queue);
    }

}
