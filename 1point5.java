// Write a method to replace all spaces in a string with a "%20"

import java.io.*;
import java.util.*;


public class Solution
{
	public static String replaceString(String input)
	{
		String edited = input.replaceAll(" ","%20");
		return edited;

	}
	public static void main(String[] args)
	{
		input = "Hi there"
		String output = replaceString(input);
		System.out.println(output);
	}
}