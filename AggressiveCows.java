/*
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ want to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
Input

t – the number of test cases, then t test cases follows. 
* Line 1: Two space-separated integers: N and C
* Lines 2..N+1: Line i+1 contains an integer stall location, xi
Output

For each test case output one integer: the largest minimum distance.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//import java.math.*;

public class Main
{
	public static int maxrange(long in[],long temp,long cows)
	{
		int prev=0;
		cows--;
		for(int i=1;i<in.length;i++)
		{
			if(in[i]-in[prev]>=temp)
			{
				prev=i;
				cows--;
			}
			if(cows==0)
			return 1;
		}
		return 0;
		
	}

	public static void main (String[] args) throws java.lang.Exception
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			String temp[] = (br.readLine()).split(" ");
			int n = Integer.parseInt(temp[0]);
			long c = Long.parseLong(temp[1]);
			long in[]=new long[n];
			for(int i=0;i<n;i++)
			{
				in[i] = Long.parseLong(br.readLine());
			}
			Arrays.sort(in);
			long i=0,j=in[n-1]-in[0]+1;
			if(c==2)
			{
				System.out.println(in[n-1]-in[0]);
			}
			else
			{
			while(j-i>1)
			{
			long mid =(i+j)/2;
			
			int res=maxrange(in,mid,c);
			if(res==0)
			j=mid;
			else
			i=mid;
			}
			System.out.println(i);
			}
			t--;
		}
	
	}

}
