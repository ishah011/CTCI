/*
*
4.1
Implement a function to check if a binary tree is balanced. 
For the purposes of this question, a balanced tree is defined to be a tree such that 
the heights of the two subtrees of any node never differ by more than one.
*
*/

boolean boolLeft = true;
boolean boolRight = true;

public static boolean isBalanced(Node root)
{
	if(root == null)
	{
		return true;
	}
	else if(Math.abs(root.left.height() - root.right.height()) > 1)
	{
		return false;
	}
	else
	{
		boolLeft = isBalanced(root.left);
		boolRight = isBalanced(root.right);

		if(boolRight == false || boolLeft == false)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}