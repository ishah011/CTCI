/*
* 4.5
* Implement a function to check if a binary tree is a binary search tree
*
*/

boolean isBST(TreeNode root, boolean answer)
{
	if((subroot.left && subroot.left.data > subroot.data) || (subroot.right && subroot.right.data < subroot.data))
	{
		answer = false
		return answer;
	}
	else if(!subroot.left && !subroot.right)
		return answer;
	else if(!subroot.left)
		return answer;
	else if(!subroot.right)
		return answer;
	else
		return (isBST(subroot.left, answer) && isBST(subroot.right, answer));
}