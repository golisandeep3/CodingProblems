/*Find last digit of a base to the power Ex: a^b */

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

	public static void main (String[] args) throws java.lang.Exception
	{
		int pat[] ={ 0,0,0,0, 1,1,1,1, 6,2,4,8, 1,3,9,7, 6,4,6,4, 5,5,5,5, 6,6,6,6, 1,7,9,3, 6,8,4,2, 1,9,1,9 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int res=0;
		while(n>0)
		{
			String temp[]=(br.readLine()).split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			if(b==0)
			res=1;
			else
			{
			a=a%10;
			
			res=pat[4*a+b%4];
			}

	
		System.out.println(res);
		n--;
		}
	}
}
