import java.util.*;

public class BSLeverTraversal2_107 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		int rowSize = root == null ? 0:1;
		queue.add(root);
		while(rowSize != 0){
			List<Integer> list = new ArrayList<>();
			int nextRow = 0;
			for(int i = 0; i < rowSize; i++){
				TreeNode p = queue.poll();
				list.add(p.val);
				if(p.left != null){
					nextRow++;
					queue.add(p.left);
				}
				if(p.right != null){
					nextRow++;
					queue.add(p.right);
				}
			}
			rowSize = nextRow;
			result.add(0, list);
		}
		return result;
	}
}