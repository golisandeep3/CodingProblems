/* Works for * and . */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean match(String str,String pat)
	{
		if(str.length()==0 && pat.length()==0)
		return true;
		if(str.length()==0 || pat.length()==0)
		return false;
		if(pat.length()>=2)
		{
			if(pat.charAt(1)=='*')
			
			return matchstar(str,pat.substring(2),pat.charAt(0));
		}
		
		if(str.charAt(0)==pat.charAt(0) || pat.charAt(0)=='.')
		return match(str.substring(1),pat.substring(1));
		
		return false;
	}
	
	public static boolean matchstar(String str,String pat,char a)
	{
			if(match(str,pat))
			return true;
	while(str.length()!=0 && (str.charAt(0)==a||a=='.'))
	{
		if(match(str.substring(1),pat))
		return true;
		str = str.substring(1);
	}
	
	return false;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		String str= "aabc";
		String pat = "c*a*b";
		
		System.out.println(match(str,pat));
	}
}
