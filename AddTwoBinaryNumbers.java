/*Time complexity O(M+N)   where m and n are lengths of input strings */
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void addNumbers(String a,String b)
	{
		String result="";
		int i=0,j=0;
		int carry=0;
		for( i=a.length()-1,j=b.length()-1;i>=0&&j>=0;i--,j--)
		{
			
			int sum = (a.charAt(i)-'0' + b.charAt(j)-'0');
			result=sum%2 + result;
			carry = sum/2;
		
		}
		
		while(i>=0)
		{
			int sum = (a.charAt(i)-'0' + b.charAt(j)-'0');
			result=sum%2 + result;
			carry = sum/2;
			i--;
		}
		while(j>=0)
		{
			int sum = (a.charAt(i)-'0' + b.charAt(j)-'0');
			result=sum%2 + result;
			carry = sum/2;
			j--;
		}
		System.out.println(carry+result);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	addNumbers("101","100");
	}
}
