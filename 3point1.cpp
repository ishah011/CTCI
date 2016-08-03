/*
*
3.1
*
Describe how you could use a single array to implement 3 stacks
*
*/

void threeStacks(int[] arr)
{
	if(arr%3 != 0)
	{
		cout<<"Please input an array divisible by 3"<<endl;
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

		// if(index < arr.length()/3)
		// {

		// }
		// else if(index > (arr.length()/3)*2)
		// {

		// }
		// else
		// {

		// }
	}

}