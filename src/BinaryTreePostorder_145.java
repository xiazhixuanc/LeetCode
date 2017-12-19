import java.util.*;
public class BinaryTreePostorder_145 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack();
		TreeNode p = root;
		stack.push(p);
		while(!stack.empty()){
			p = stack.pop();
			result.add(0, p.val);
			if(p.left != null){
				stack.push(p.left);
			}
			if(p.right != null){
				stack.push(p.right);
			}
		}
		return result;
	}
}