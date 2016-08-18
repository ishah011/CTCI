public class Node
{
	int data;
	Node left;
	Node right;
	public static void Node(Node l, Node r, int dat)
	{
		int data = dat;
		Node left = l;
		Node right = r;
	}
}

public class binarySearch
{
	public static void set_root(int arr[], int size, Node root)
	{
		if(size/2 < 1)
		{
			return;
		}
		else
		{
			root.data = arr[size/2 + 1]
			set_root(arr, size/2, root.left);
			set_root(arr, size-(size/2), root.right);
		}
	}
}