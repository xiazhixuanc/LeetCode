import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeft_513 {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		int result = 0;
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode p = queue.poll();
			if(p.right != null){
				queue.add(p.right);
			}
			if(p.left != null){
				queue.add(p.left);
			}
			result = p.val;
		}
		return result;
	}
}