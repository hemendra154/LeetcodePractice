import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal103 {

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

        System.out.println(zigzagLevelOrder(t1));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        List<Integer> firstLevel = new ArrayList<>();
        firstLevel.add(root.val);
        Stack<TreeNode> firstStack = new Stack<>();
        firstStack.add(root.left);
        firstStack.add(root.right);

        result.add(firstLevel);
        getNextLevel(firstStack, result, 1);
        return result;
    }

    void getNextLevel(Stack<TreeNode> stack, List<List<Integer>> result, int i) {
        Stack<TreeNode> tempStack = new Stack<>();
        List<Integer> currentLevel = new ArrayList<>();
        boolean rightFirst = i%2 != 0 ? true : false;
        while(!stack.empty()){
            TreeNode node = stack.pop();
            if(node == null)
                continue;
            currentLevel.add(node.val);
            if(rightFirst){
                tempStack.add(node.right);
                tempStack.add(node.left);
            }else{
                tempStack.add(node.left);
                tempStack.add(node.right);
            }
        }

        if(!currentLevel.isEmpty())
            result.add(currentLevel);
        if(!tempStack.empty())
            getNextLevel(tempStack,result,i+1);

    }

}
