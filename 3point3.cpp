/*
3.3
*
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. 
Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is, pop() should return the same values as it would if there were just a single stack).
*
*/

//linked list of stacks, when one stack is at capacity, make a new node containing a stack and link the previous one to it.

class setOfStacks
{
	list<Stack<int>> stackList;
	Stack<int> first_stack;
	stackList.emplace_front(first_stack);
	int capacity = 15;
	Stack<int>* curr_stack = &stackList.front;
	curr_stack->next = NULL;

	void push(int value)
	{
		//if the current stack is at capacity, make a new node with a stack and append it to the list of stacks. then push the value on to the new stack
		if((*curr_stack).size() == capacity)
		{
			stackList.push_back(Stack<int>);
			curr_stack = curr_stack->next;
			curr_stack->next = NULL;
		}
		(*curr_stack).push(value);
	}

	void pop()
	{
		//if the current stack is empty, remove it from the list and pop off of the stack before it.
		if(*curr_stack).empty()
		{
			curr_stack = curr_stack->prev;
			stackList.pop_back();
			curr_stack->next = NULL;
		}
		(*curr_stack).pop();
	}
}