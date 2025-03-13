import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePreorderTraversal144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        preOrder(root, preOrder);
        return preOrder;
    }

    void preOrder(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        leverOrder(result, queue);
        return result;
    }

    void leverOrder(List<List<Integer>> result, Queue<TreeNode> queue) {
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
            leverOrder(result, queue);
    }
}

