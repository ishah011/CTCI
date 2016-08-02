/*
*2.6
Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.
DEFINITION
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
EXAMPLE
Input: A - > B - > C - > D - > E - > C [the same C as earlier]
Output: C
*/

//FastRunner SlowRunner Method
//The FastRunner and SlowRunner pointers are guaranteed to meet at one point
//after that point, move SlowRunner back to the beginning and keep FastRunner as is
//when they collide again, return that node

Node circularList(List list)
{
	Node* FastRunner = list->head;
	Node* SlowRunner = list->head;

	while(FastRunner != SlowRunner)
	{
		FastRunner = FastRunner->next->next;
		SlowRunner = SlowRunner->next;
	}
	SlowRunner = list->head;

	while(FastRunner != SlowRunner)
	{
		FastRunner = FastRunner->next;
		SlowRunner = SlowRunner->next;
	}

	return *SlowRunner
}
