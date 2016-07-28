/*
*
2.3
Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node
*
*/

public static void removeMiddle(Node middle, Node head)
{
	Node curr = head;
	while(curr.next != middle)
	{
		curr = curr.next;
	}
	curr.next = curr.next.next;
}