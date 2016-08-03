/*
*
3.2
How would you design a stack which, in addition to push and pop, 
also has a function min which returns the minimum element? 
Push, pop, and min should all operate in O(1) time
*
*/
struct NodeMin{
	int value;
	int min;
	NodeMin(int val, int minimum)
	{
		value = val;
		min = minimum;
	}
}

//Each node keeps track of the minimum of all of the nodes before it
class StackMinimum : public Stack<NodeMin>
{
	public:
		void push(int value)
		{
			int min_val;
			if(Stack<NodeMin>::isEmpty())
			{
				min_val = value;
			}
			else
			{
				if(value < min())
				{
					min_val = value;
				}
				else
				{
					min_val = min();
				}
			}
			NodeMin new_node = NodeMin(value, min_val);
			Stack<NodeMin>::push(new_node);
		}

		int min()
		{
			if(Stack<NodeMin>::isEmpty())
			{
				return -1;
			}
			return Stack<NodeMin>::peek().min;
		}

}