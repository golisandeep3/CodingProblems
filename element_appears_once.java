/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{


	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		int res=0;
		for(int j=0;j<32;j++)
		{
			int sum=0;
			int k = (1<<j);
		for(int i=0;i<a.length;i++)
		{
			if((a[i] & k)!=0)
			sum++;
		}
		//System.out.println(sum);
		if(sum%3==1)
		res=(res|k);
		}
		System.out.println(res);
 

	}
}
