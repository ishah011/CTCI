public class sortStack()
{
	public static Stack<int> sortStackAscending(Stack<int> stack1)
	{
		Stack<int> stack2 = new Stack<int>();
		while(!stack1.isEmpty())
		{
			int temp = stack1.pop()
			while(!stack2.isEmpty() && stack2.peek() > temp)
			{
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		return stack2;
	}
}