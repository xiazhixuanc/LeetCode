import java.util.*;

public class BTZigzag_103 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		int rowSize = root == null ? 0:1;
		int odd = 1;
		queue.add(root);
		while(rowSize != 0){
			int nextRow = 0; 
			LinkedList<Integer> list = new LinkedList<>();
			for(int i = 0; i < rowSize; i++){
				root = queue.poll();
				if(odd == 1){
					list.add(root.val);
				}else{
					list.addFirst(root.val);
				}
				if(root.left != null){
					nextRow++;
					queue.add(root.left);
				}
				if(root.right != null){
					nextRow++;
					queue.add(root.right);
				}
			}
			odd = (odd + 1) % 2;
			result.add(list);
			rowSize = nextRow;
		}
		return result;
	}
}