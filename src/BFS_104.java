import java.util.LinkedList;
import java.util.Queue;

public class BFS_104 {
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		Queue<TreeNode> que = new LinkedList<>();
		int count = 0;
		que.offer(root);
		while(!que.isEmpty()){
			int size = que.size();
			while(size > 0){
				TreeNode node = que.poll();
				if(node.right != null){
					que.offer(node.right);
				}
				if(node.left != null){
					que.offer(node.left);
				}
				size--;
			}
			count++;
		}
		return count;
	}
}
