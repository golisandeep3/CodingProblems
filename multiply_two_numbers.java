/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={1,2,3,4};
		int b[]={4,5,6};
		int out[] = new int[a.length+b.length+1];
		int k=out.length-1;

	for(int i=b.length-1;i>=0;i--)
	{
		int carry=0;
		int temp = k;
		for(int j=a.length-1;j>=0;j--)
		{
			int sum = (b[i]*a[j])+carry+out[temp];

			out[temp]=sum%10;
			carry = sum/10;
			temp--;
			
			
		}
			
	
		k--;
		
	}
	for(int i=0;i<out.length;i++)
	System.out.print(out[i]);
	}
}
