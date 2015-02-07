/* Prime numbers between two given numbers  maximum input 1000000000 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	
	public static boolean checkprime(int num)
	{
		int end=(int)Math.sqrt(num);
		for(int i=2;i<=end;i++)
		{
			if(num%i==0)
			return false;
		}
		return true;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	int prime[]=new int[4000];
	int c=0;
	prime[c++]=2;
	for(int i=3;i<32000;i++)
	{
		if(checkprime(i))
		prime[c++]=i;
	}
	
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		while(n>0)
		{
		String temp[] = (br.readLine()).split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		
		for(int i=a;i<=b;i++)
		{
			int flag=0;
			for(int j=0;j<c&&prime[j]<i;j++)
			{
				if(i%prime[j]==0)
				{
					flag=1;
				break;
				}
			}
			if(flag==0&& i!=1)
			System.out.println(i);
		}
	
		System.out.println();
			n--;
		}
	}
}
