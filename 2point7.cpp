/*
*
2.7
Implement a function to check if a linked list is a palindrome
* 
*/

bool isPalindrome(List list)
{
	Node* currFront = head;
	Node* currBack = tail;

	while(currFront != currBack && currBack->next != currFront)
	{
		if(*currFront != *currBack)
		{
			return false;
		}
		else
		{
			currBack = currBack->prev;
			currFront = currFront->next;
		}
	}
	return true;
}
