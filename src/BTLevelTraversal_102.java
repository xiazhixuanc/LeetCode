import java.util.*;


public class BTLevelTraversal_102 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		int rowSize = root == null ? 0 : 1;
		queue.add(root);
		while(rowSize != 0){
			List<Integer> list2 = new ArrayList<>();
			int nextRow = 0;
			for(int i = 0; i < rowSize; i++){
				TreeNode p = queue.poll();
				list2.add(p.val);
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
			list.add(list2);
		}
		return list;
	}
}