import java.util.LinkedList;
import java.util.Queue;

public class AddRowTree_623 {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if(d == 1){
			TreeNode head = new TreeNode(v);
			head.left = root;
			return head;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		for(int i = 0; i < d-2; i++){
			int size = queue.size();
			for(int j = 0; j < size; j++){
				TreeNode p = queue.poll();
				if(p.left != null)   queue.add(p.left);
				if(p.right != null)  queue.add(p.right);
			}
		}
		while(!queue.isEmpty()){
			TreeNode p = queue.poll();
			TreeNode t = p.left;
			p.left = new TreeNode(v);
			p.left.left = t;
			t = p.right;
			p.right = new TreeNode(v);
			p.right.right = t;
		}
		return root;
	}
}