/*
It is typical binary search problem.The way we solve these type of problems is define a predicate which returns a true or false for 
a particular index, and depending upon the problem ,decrease the size of search space.
*/

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {1,5,6,8,10};
		int x=9;
		int low=0;
		int high=a.length-1;
		while(low<high)
		{
			int mid = low+(high-low)/2;
			if(a[mid] >= x)
			{
				high=mid;
			}
			else
			{
				low=mid+1;
			}
		}
		
		System.out.println(a[low]);

	}
}
