ArrayList<LinkedList<TreeNode>> createLevelLists(TreeNode root)
{
	ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
	LinkedList<TreeNode> current = new LinkedList<TreeNode>();
	LinkedList<TreeNode> q = new LinkedList<TreeNode>();
	if(root)
		current.add(root);
	q.add(root);
	TreeNode curr;
	while(!q.isEmpty())
	{
		result.add(current);
		LinkedList<TreeNode> parents = current;
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		for(TreeNode parent:parents){
			q.popfront();
			if(parent.right)
			{
				current.add(parent.right);
				q.add(parent.right);
			}
			if(parent.left)
			{
				current.add(parent.left);
				q.add(parent.left);
			}
		}
	}
	return result;
}