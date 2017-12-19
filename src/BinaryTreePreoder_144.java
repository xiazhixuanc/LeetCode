import java.util.*;
public class BinaryTreePreoder_144 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}

		Stack<TreeNode> stack = new Stack();
		TreeNode p = root;
		stack.push(p);
		while(!stack.empty()){
			p = stack.pop();
			result.add(p.val);
			if(p.right != null){
				stack.push(p.right);
			}
			if(p.left != null){
				stack.push(p.left);
			}
		}
		return result;
	}
}