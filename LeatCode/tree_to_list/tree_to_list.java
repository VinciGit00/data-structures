import java.util.LinkedList;

public class tree_to_list {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public void flatten(TreeNode root) {
		LinkedList result = result(root);
	}

	public LinkedList result(TreeNode t) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		support(t, list);
		return list;
	}

	public void support(TreeNode t, LinkedList l) {
		l.add(t.val);
		if (t.left != null)
			support(t.left, l);
		if (t.right != null)
			support(t.right, l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
