/*
http://www.spoj.com/problems/HOTELS/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			String temp[] = (br.readLine().trim()).split(" ");
			int n = Integer.parseInt(temp[0].trim());
			int m = Integer.parseInt(temp[1].trim());
			String input[] = (br.readLine().trim()).split(" ");
				
			int sum=0;
			int maxsum=0,marker=0;
			for(int i=0;i<n && marker<n;i++)
			{
				int k = sum+Integer.parseInt(input[i]);
				if(k < m)
				sum=k;
				else if(k==m)
				{
					maxsum=k;
					break;
				}
				else
				{
				while(k>m && marker <n)
				{
					k = k-Integer.parseInt(input[marker]);
					marker++;
				}
				sum=k;
				}
				maxsum = Math.max(maxsum,sum);
			}
			
			System.out.println(maxsum);
			
			
		
	}
}
