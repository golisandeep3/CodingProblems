/*
http://www.spoj.com/problems/FARIDA/
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
		int t = Integer.parseInt(br.readLine().trim());
		int p =1;
		while(p<=t)
		{
			int n = Integer.parseInt((br.readLine().trim()));
			if(n==0)
			{
				br.readLine();
				System.out.println("Case "+p +": "+0);
						p++;
						continue;
			}
			String temp[] = (br.readLine().trim()).split(" ");
			
			long excl=0;
			long incl =0;
			for(int i=0;i<temp.length;i++)
			{
				long _excl = Math.max(incl,excl);
				long _incl = excl+Long.parseLong(temp[i].trim());
				incl = _incl;
				excl = _excl;
				
			}
			
			System.out.println("Case "+p +": "+Math.max(incl,excl));
		
			
			
			p++;
		}
	}
}
