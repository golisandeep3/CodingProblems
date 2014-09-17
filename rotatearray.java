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
		int a[]={1,2,3,4,5,6,7,8};
		int amount=3;
		reverse(a,0,amount-1);
		reverse(a,amount,a.length-1);
		reverse(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
	public static void reverse(int a[],int i,int j)
	{
		while(i<j)
		{
			a[i] = a[i]^a[j];
			a[j] = a[j]^a[i];
			a[i] = a[i]^a[j];
			i++;
			j--;
		}
	}
}
