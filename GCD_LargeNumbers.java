/* one number fits in integer,other number is max of 10^256 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static int gcd(char m[],int n)
	{
		int t=0;
		for(int i=0;i<m.length;i++)
		{
			t = (10*t+(m[i]-'0'))%n;
		}
		return gcd2(n,t);
	}
	public static int gcd2(int a,int b)
	{
		if(b==0)
		return a;
		return gcd2(b,a%b);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t>0)
		{
			String temp[] = (br.readLine().trim()).split(" ");
			int n = Integer.parseInt(temp[0]);
			String m= temp[1];
		System.out.println(gcd(m.toCharArray(),n));
			
			
			t--;
		}
	}
}
