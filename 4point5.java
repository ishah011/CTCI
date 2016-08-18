boolean isBST(TreeNode root)
{
	if(!subroot.left && !subroot.right)
	{
		return true;
	}
	else if(subroot.left > subroot || subroot.right < subroot)
	{
		return false;
	}
	else
	{
		 return (isBST(subroot.left) && isBST(subroot.right));
	}
}