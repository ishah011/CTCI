/*
*
3.1
*
Describe how you could use a single array to implement 3 stacks
*
*/

int stack1 = -1;
int stack2 = -1;
int stack3 = -1;
int stack1_full = 0;
int stack2_full = 0; 
int stack3_full = 0;
int stack1_empty = 0;
int stack2_empty = 0; 
int stack3_empty = 0;
int length = -1;
int* stackArray = NULL;

void threeStacks(int* arr, int len)
{
	length = len;
	if(length%3 != 0 || length == 0)
	{
		cout<<"Please input an array with a non-zero length divisible by 3"<<endl;
		return;
	}
	
	else
	{
		//want to make each stack be a third of the array
		//store the top of each stack in a variable
		//when you push, you increase the index by one and store the value in that location
		//when you pop, you decrease the index by one
		//if the index is at the limit (the correct multiple of the length of the array/3)
			//don't push and print stack overflow (vice versa for underflow)

		stack1 = 0;
		stack2 = length/3;
		stack3 = (length/3)*2;

		stackArray = arr;
	}

}

int top(int stackNumber)
{
	if(stackNumber == 1)
	{
		return stackArray[stack1];
	}
	else if(stackNumber == 2)
	{
		return stackArray[stack2];
	}
	else if(stackNumber == 3)
	{
		return stackArray[stack3];
	}
	else
	{
		cout<<"Invalid stack number. Please enter a number between 1 and 3."<< endl;
	}
}

void push(int value, int stackNumber)
{
	if(stackNumber == 1)
	{
		if(stack1 < (length/3)-1)
		{
			stackArray[stack1] = value;
			stack1++;
		}
		else if((stack1 == (length/3)-1) && stack1_full != 1)
		{
			stackArray[stack1] = value;
			stack1_full = 1;
		}
		else
		{
			cout << "Stack overflow" << endl;
		}
	}
	else if(stackNumber == 2)
	{
		if(stack2 < 2*(length/3)-1)
		{
			stackArray[stack2] = value;
			stack2++;
		}
		else if((stack2 == 2*(length/3)-1) && stack2_full != 1)
		{
			stackArray[stack2] = value;
			stack2_full = 1;
		}
		else
		{
			cout << "Stack overflow" << endl;
		}
	}
	else if(stackNumber == 3)
	{
		if(stack3 < length-1)
		{
			stackArray[stack3] = value;
			stack3++;
		}
		else if((stack3 == length-1) && stack3_full != 1)
		{
			stackArray[stack3] = value;
			stack3_full = 1;
		}
		else
		{
			cout << "Stack overflow" << endl;
		}
	}
	else
	{
		cout<<"Invalid stack number."<<endl;
	}
}

int pop(int stackNumber)
{
	if(stackNumber == 1)
	{
		if(stack1 > 0)
		{
			stackArray[stack1] = value;
			stack1++;
		}
		else if((stack1 == 0) && stack1_empty != 1)
		{
			stackArray[stack1] = value;
			stack1_empty = 1;
		}
		else
		{
			cout << "Stack underflow" << endl;
		}
	}
	else if(stackNumber == 2)
	{
		if(stack2 > (length/3))
		{
			stackArray[stack2] = value;
			stack2++;
		}
		else if((stack2 == (length/3)) && stack2_empty != 1)
		{
			stackArray[stack2] = value;
			stack2_empty = 1;
		}
		else
		{
			cout << "Stack underflow" << endl;
		}
	}
	else if(stackNumber == 3)
	{
		if(stack3 > 2*(length/3))
		{
			stackArray[stack3] = value;
			stack3++;
		}
		else if((stack3 == 2*(length/3)) && stack3_empty != 1)
		{
			stackArray[stack3] = value;
			stack3_empty = 1;
		}
		else
		{
			cout << "Stack underflow" << endl;
		}
	}
	else
	{
		cout<<"Invalid stack number."<<endl;
	}
}