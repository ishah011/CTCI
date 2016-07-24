 //reverse a string
#include <string.h>
int reverse_string(char[] input)
{
	int length = strlen(input);

	//there should be at least a null character, making the length 1 or greater, for the string to be valid
	if(length == 0)
	{
		printf("Invalid input");
		return -1;
	}

	//in the case where there is only the null character or only one other character, the original string IS the reversed version
	else if(length == 1 || length == 2)
	{
		return 0;
	}

	//the case where there is more than one character
	else
	{
		int actual_length = length - 1;
		int front = 0;
		int end = actual_length;
		char temp;

		//if the front index is greater than or equal to the end, we have past the mid-point and reversed the string
		while(front < end)
		{
			temp = input[end];
			input[end] = input[front];
			input[front] = temp;
			front++;
			end--;
		}
		return 0;
	}
}
