/* package whatever; // don't place package name! */
/*
http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	int a[] = {6, 2, 5, 4, 5, 1, 6};
	Stack<Integer> st = new Stack<Integer>();
	int maxarea=0,i=0;
	for( i=0;i<a.length;i++)
	{
		if(st.isEmpty() || a[st.peek()] <= a[i])
		st.push(i);
		else
		{
			while(!st.isEmpty() && a[st.peek()] > a[i])
			{
				int area = a[st.pop()] *(st.isEmpty()?i:i-st.peek()-1);
				maxarea = Math.max(maxarea,area);
			}
			st.push(i);
		}
	}
	while(!st.isEmpty())
	{
			int area = a[st.pop()] *(st.isEmpty()?i:i-st.peek()-1);
				maxarea = Math.max(maxarea,area);
	}

	System.out.println(maxarea);
	}
}
