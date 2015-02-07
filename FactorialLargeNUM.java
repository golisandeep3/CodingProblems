/* Factorial of large number */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		while(n>0)
		{
	
		int a = Integer.parseInt(br.readLine());
		BigInteger bi  = new BigInteger(a+"");
		for(int i=2;i<a;i++)
		{
			bi=bi.multiply(new BigInteger(i+""));
		}
	
		System.out.println(bi);
			n--;
		}
	}
}
