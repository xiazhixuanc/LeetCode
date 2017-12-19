import java.util.*;

public class BTRightView_199 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		int rowSize = root == null ? 0:1;
		queue.add(root);
		while(rowSize != 0){
			int nextRow = 0;
			for(int i = 0; i < rowSize; i++){
				root = queue.poll();
				if(root.left != null){
					nextRow++;
					queue.add(root.left);
				}
				if(root.right != null){
					nextRow++;
					queue.add(root.right);
				}
			}
			result.add(root.val);
			rowSize = nextRow;
		}
		return result;
	}
}
