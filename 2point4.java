/* Write code to partition a linked list around a value x, such that all nodes less than
x come before all nodes greater than or equal to x.*/

public static void partition(int x, Node head, Node tail)
{
	Node curr = head;
	Node prev = null;
	Node mov = null;
	int firstMov = -1;

	// traverse list, find node with value x
	// while traversing, if the value of the node is greater than x, move to the end of the list
	while(curr.data != x)
	{
		if(curr == head)
		{
			if(curr.data > x)
			{
				//checking to see if anything else has been moved before
				if(firstMov == -1)
				{
					firstMov = curr.data;
				}

				mov = curr;
				head = curr.next;
				tail.next = mov;
				mov.next = null;
				curr = head;
			}
			else
			{
				prev = curr;
				curr = curr.next;
			}
		}
		else
		{
			if(curr.data > x)
			{
				//checking to see if anything else has been moved before
				if(firstMov == -1)
				{
					firstMov = curr.data;
				}

				mov = curr;
				curr = curr.next;
				prev.next = curr;
				tail.next = mov;
				move.next = null;
			}
			else
			{
				prev = curr;
				curr = curr.next;
			}
		}
	}
	
	prev = curr;
	curr = curr.next;

	// keep traversing
	// if the value is less than x, move it to front of the list
	// if you reach a node that you've already seen, stop
	while(curr.data != firstMov)
	{
		if(curr.data < x)
		{
			mov = curr;
			curr = curr.next;
			prev.next = curr;
			move.next = head;
			head.next = mov;
		}
		else
		{
			prev = curr;
			curr = curr.next;
		}
	}
}