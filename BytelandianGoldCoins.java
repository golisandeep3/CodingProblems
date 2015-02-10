/* Problem link http://www.spoj.com/problems/COINS/ */

import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
static HashMap<Long,Long> hm = null;
public static long max_amount(long n)
{
	if(n<12 && n>=0)
	return n;
	if(hm.get(n)!=null)
	return hm.get(n);
	long temp  = max_amount(n/2)+max_amount(n/3)+max_amount(n/4);
	long res=0;
	if(temp>n)
	{
		 hm.put(n,temp);
		 res=temp;
	}
	else
	{
		 hm.put(n,n);
		 res=n;
	}
	return res;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		hm=new HashMap<Long,Long>();
		
		while((s = br.readLine())!=null )
		{
		long n = Long.parseLong(s);
	 long res=	max_amount(n);
	 System.out.println(res);
		}
		
	}
}
