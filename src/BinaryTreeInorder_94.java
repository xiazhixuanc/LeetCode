import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder_94 {
	private class TreeNode{
		private int val;
		private TreeNode left;
		private TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	public List<Integer> inoderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack();
		TreeNode p = root;
		while(p != null || !stack.empty()){
			while(p != null){
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			result.add(p.val);
			p = p.right;
		}
		return result;
	}
}
