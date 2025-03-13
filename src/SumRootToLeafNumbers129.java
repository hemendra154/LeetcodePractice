import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SumRootToLeafNumbers129 {
    public int sumNumbers(TreeNode root) {
        List<Integer> sumList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        dfs(stack, sumList);
        int result = 0;
        for(Integer number : sumList){
            result += number;
        }
        return result;
    }

    void dfs(Stack<TreeNode> stack, List<Integer> sumList){
//        TreeNode top =
    }
}
